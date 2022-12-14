package com.account.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.account.entity.Account;
import com.account.entity.AccountCreationStatus;
import com.account.entity.TransactionStatus;
import com.account.repository.AccountCreationStatusRepo;
import com.account.repository.AccountRepo;
import com.account.repository.TransactionStatusRepo;

@Service
public class AccountServiceImpl implements IAccountService {
@Autowired
AccountRepo accountRepo;
@Autowired
AccountCreationStatusRepo accountCrRepo;
@Autowired
TransactionStatusRepo transactionStatusrepo;

@Override
public AccountCreationStatus saveAccount(Account account) throws Exception {
	Account acc=accountRepo.save(account);
	AccountCreationStatus accountCreationStaus= new AccountCreationStatus();
	if(acc.getAccountId()!=null) {
	accountCreationStaus.setAccountId(acc.getAccountId());
	accountCreationStaus.setMessage("Account Created Sucessfully");
	accountCrRepo.save(accountCreationStaus);
	}else { throw new Exception("Invalid Credetials");}
	return accountCreationStaus; 
}

@Override
public List<Account> getbycustomerId(Integer customerId) {
	// TODO Auto-generated method stub
	return  accountRepo.findBycustomerId(customerId);
}

@Override
public Optional<Account> getbyaccountId(Integer accountId) {

	return accountRepo.findById(accountId);
}

@Override
public TransactionStatus depositAmount(Account account, Integer accountId  ) {
	Account existingAccount=accountRepo.getById(accountId);
	Long previousBalance= existingAccount.getBalance();
	System.out.println(previousBalance);
	Long newBalance = account.getBalance()+previousBalance;
	System.out.println(newBalance);
	account.setBalance(newBalance);
    Account updatedaccount= new Account();
    updatedaccount.setAccountId(existingAccount.getAccountId());
    updatedaccount.setAccountType(existingAccount.getAccountType());
    updatedaccount.setBalance(newBalance);
    updatedaccount.setCustomerId(existingAccount.getCustomerId());
    accountRepo.save(updatedaccount);
	TransactionStatus status= new TransactionStatus();
	status.setAccountId(updatedaccount.getAccountId());
	status.setSource_balance(previousBalance);
	status.setDestination_balance(updatedaccount.getBalance());
	transactionStatusrepo.save(status);
	return status;
}

@Override
public TransactionStatus withdrawAmount(Account account, Integer accountId) {
	Account existingAccount=accountRepo.getById(accountId);
	Long previousBalance= existingAccount.getBalance();
	System.out.println(previousBalance);
	Long newBalance = previousBalance-account.getBalance();
	System.out.println(newBalance);
	account.setBalance(newBalance);
    Account updatedaccount= new Account();
    updatedaccount.setAccountId(existingAccount.getAccountId());
    updatedaccount.setAccountType(existingAccount.getAccountType());
    updatedaccount.setBalance(newBalance);
    updatedaccount.setCustomerId(existingAccount.getCustomerId());
    accountRepo.save(updatedaccount);
	TransactionStatus status= new TransactionStatus();
	status.setAccountId(updatedaccount.getAccountId());
	status.setSource_balance(previousBalance);
	status.setDestination_balance(updatedaccount.getBalance());
	transactionStatusrepo.save(status);
	return status;
}


}
