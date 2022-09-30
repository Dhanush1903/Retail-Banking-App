package com.account.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountCreationStatus {
	@Id
	private Integer accountId;
	private String message;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public AccountCreationStatus(Integer accountId, String message) {
		super();
		this.accountId = accountId;
		this.message = message;
	}
	@Override
	public String toString() {
		return "AccountCreationStatus [accountId=" + accountId + ", message=" + message + "]";
	}
	public AccountCreationStatus() {
		super();
	}
	

}