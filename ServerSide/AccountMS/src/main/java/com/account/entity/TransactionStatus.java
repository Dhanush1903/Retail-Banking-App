package com.account.entity;

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
public class TransactionStatus {
	@Id
	private Integer accountId;
	private Long source_balance;
	private Long destination_balance;
	
}
