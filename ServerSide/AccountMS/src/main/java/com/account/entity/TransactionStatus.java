package com.account.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class TransactionStatus {
	@Id
	private Integer accountId;
	private Long source_balance;
	private Long destination_balance;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Long getSource_balance() {
		return source_balance;
	}
	public void setSource_balance(Long source_balance) {
		this.source_balance = source_balance;
	}
	public Long getDestination_balance() {
		return destination_balance;
	}
	public void setDestination_balance(Long destination_balance) {
		this.destination_balance = destination_balance;
	}
	public TransactionStatus(Integer accountId, Long source_balance, Long destination_balance) {
		super();
		this.accountId = accountId;
		this.source_balance = source_balance;
		this.destination_balance = destination_balance;
	}
	public TransactionStatus() {
		super();
	}
	@Override
	public String toString() {
		return "TransactionStatus [accountId=" + accountId + ", source_balance=" + source_balance
				+ ", destination_balance=" + destination_balance + "]";
	}
	
}
