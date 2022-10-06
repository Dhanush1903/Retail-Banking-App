package com.account.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Statement {
	@Id
	private Integer refNo;
	private Date from_date;
	private Date to_date;
	private String  narration;
	private Date valueDate;
	private Long withdrawal;
	private Long deposit;
	private Long closingBalance;
	private Integer accountId;
	public Integer getRefNo() {
		return refNo;
	}
	public void setRefNo(Integer refNo) {
		this.refNo = refNo;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public Long getWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(Long withdrawal) {
		this.withdrawal = withdrawal;
	}
	public Long getDeposit() {
		return deposit;
	}
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}
	public Long getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(Long closingBalance) {
		this.closingBalance = closingBalance;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Statement(Integer refNo, Date from_date, Date to_date, String narration, Date valueDate, Long withdrawal,
			Long deposit, Long closingBalance, Integer accountId) {
		super();
		this.refNo = refNo;
		this.from_date = from_date;
		this.to_date = to_date;
		this.narration = narration;
		this.valueDate = valueDate;
		this.withdrawal = withdrawal;
		this.deposit = deposit;
		this.closingBalance = closingBalance;
		this.accountId = accountId;
	}
	public Statement() {
		super();
	}
	@Override
	public String toString() {
		return "Statement [refNo=" + refNo + ", from_date=" + from_date + ", to_date=" + to_date + ", narration="
				+ narration + ", valueDate=" + valueDate + ", withdrawal=" + withdrawal + ", deposit=" + deposit
				+ ", closingBalance=" + closingBalance + ", accountId=" + accountId + "]";
	}
	

}
