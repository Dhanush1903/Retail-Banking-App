package com.account.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.web.bind.annotation.PathVariable;

import com.account.controller.AccountController;
import com.account.entity.Account;
import com.account.entity.AccountCreationStatus;
import com.account.entity.TransactionStatus;
import com.account.service.IAccountService;

import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;



@ExtendWith(MockitoExtension.class)
public class AccountTestController {
	@Mock
	IAccountService accountService;
	
	@InjectMocks
	AccountController accountController;
	
	
	
	@Test
	void testcreateAccount() throws Exception {
		Account account = new Account();
		AccountCreationStatus accountCreationStatus = new AccountCreationStatus();
		account.setAccountId(1);
		account.setAccountType("savings");
		account.setBalance((long) 123);
		account.setCustomerId(12);
		
		when(accountService.saveAccount(account)).thenReturn(accountCreationStatus);
		assertEquals( Mono.just(accountCreationStatus), accountController.createAccount(account));
	}

	
	
	@Test
	void testgetbyaccountId() {
		Account account = new Account() ;
		when(accountService.getbyaccountId(1)).thenReturn(Optional.of(account));
		assertEquals(Mono.justOrEmpty(account), accountController.getbyaccountId(1));
	}
	
	


	@Test
	void testdepositAmount() throws Exception {
		Account account = new Account() ;
		TransactionStatus transaction = new TransactionStatus();
		when(accountService.depositAmount(account, 1)).thenReturn(transaction);
		assertEquals(Mono.just(transaction), accountController.depositAmount(1, account));
		
	}

	@Test
	void testwithdrawAmount() throws Exception {
		Account account = new Account() ;
		TransactionStatus transaction = new TransactionStatus();
		when(accountService.withdrawAmount(account, 1)).thenReturn(transaction);
		assertEquals(Mono.just(transaction), accountController.withdrawAmount(account,1));
		
	}
	
	
	
	@Test
	void testgetbycustomerId() {
		Account account = new Account() ;
		account.setCustomerId(1);
		when( accountService.getbycustomerId(account.getCustomerId())).thenReturn(new ArrayList<Account>());
		assertEquals(new ArrayList<Account>(), accountController.getbycustomerId(account.getCustomerId()));
	}
	
	

	

}
