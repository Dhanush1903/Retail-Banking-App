package com.account.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
	

}
