package com.account.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.account.entity.Account;
import com.account.entity.AccountCreationStatus;
import com.account.repository.AccountCreationStatusRepo;
import com.account.repository.AccountRepo;

@ExtendWith(MockitoExtension.class)
public class AccountTestService {
	@Mock
	AccountRepo accountRepo;
	
	@Mock
	AccountCreationStatusRepo accountCreationStatusRepo;
	
	@InjectMocks
	AccountServiceImpl accountService;

	@Test
	void testsaveAccount() throws Exception {
		Account account = new Account();
		
		account.setAccountType("Savings");
		account.setBalance((long) 100);
		account.setCustomerId(101);
		AccountCreationStatus accountCreationStaus= new AccountCreationStatus();
		accountCreationStaus.setAccountId(account.getAccountId());
		accountCreationStaus.setMessage("Registered");
		lenient().when(accountRepo.save(account)).thenReturn(account);
		lenient().when(accountCreationStatusRepo.save(accountCreationStaus)).thenReturn(accountCreationStaus);;
		assertEquals( account, accountService.saveAccount(account));
		assertEquals(accountCreationStaus,accountService.saveAccount(account) );
	}

	@Test
	void testgetbycustomerId() {
		Account account = new Account();
		account.setCustomerId(1);
		when(accountRepo.findBycustomerId(account.getCustomerId()))
		.thenReturn(new ArrayList<Account>());
		assertEquals(new ArrayList<Account>(), accountService.getbycustomerId(account.getCustomerId()));
	}
	
	@Test
	void testgetbyaccountId() {
		Account account = new Account();
		when(accountRepo.findById(1)).thenReturn(Optional.of(account));
		assertEquals(Optional.of(account), accountService.getbyaccountId(1));
	}
	
}
