package com.account.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.entity.Account;
import com.account.entity.AccountCreationStatus;
import com.account.entity.TransactionStatus;
import com.account.service.IAccountService;



@RestController
public class AccountController {
	@Autowired
	IAccountService iaccountService;
	
//	create an account
	@PostMapping("/create")
	AccountCreationStatus createAccount(@RequestBody Account account) throws Exception {
		AccountCreationStatus acc= iaccountService.saveAccount(account);
		return acc;
	}
	
//	get Customer Accounts
	@GetMapping("/getbycustomerId/{customerId}")
	public List<Account> getbycustomerId(@PathVariable Integer customerId){
		List<Account> accounts = iaccountService.getbycustomerId(customerId);
		return accounts;
	}
	
//	get particular customer account
	@GetMapping("/getbyaccountId/{accountId}")
	public Optional<Account> getbyaccountId(@PathVariable Integer accountId){
		Optional<Account> account = iaccountService.getbyaccountId(accountId);
		return account;
}
	
//	deposit amount
	@PostMapping("/deposit/{accountId}")
	TransactionStatus depositAmount(@RequestBody Account account,@PathVariable Integer accountId) throws Exception {
		TransactionStatus transaction= iaccountService.depositAmount(account, accountId );
		return transaction;
	}
	
//	withdraw amount
	@PostMapping("/withdraw/{accountId}")
	TransactionStatus withdrawAmount(@RequestBody Account account,@PathVariable Integer accountId) throws Exception {
		TransactionStatus transaction= iaccountService.withdrawAmount(account, accountId );
		return transaction;
	}
	}
