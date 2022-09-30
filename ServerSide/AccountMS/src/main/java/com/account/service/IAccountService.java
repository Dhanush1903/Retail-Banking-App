package com.account.service;

import java.util.List;
import java.util.Optional;

import com.account.entity.Account;
import com.account.entity.AccountCreationStatus;
import com.account.entity.TransactionStatus;

public interface IAccountService {

	AccountCreationStatus saveAccount(Account account) throws Exception;

	List<Account> getbycustomerId(Integer customerId);

	Optional<Account> getbyaccountId(Integer accountId);

	TransactionStatus depositAmount(Account account, Integer accountId);

	TransactionStatus withdrawAmount(Account account, Integer accountId);

	

}
