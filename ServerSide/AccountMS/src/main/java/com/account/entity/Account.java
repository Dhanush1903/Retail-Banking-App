package com.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;
	private String accountType;
	private Long balance;
	private Integer customerId;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Account(Integer accountId, String accountType, Long balance, Integer customerId) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance
				+ ", customerId=" + customerId + "]";
	}
		
	}

