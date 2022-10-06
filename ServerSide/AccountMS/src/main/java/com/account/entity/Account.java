package com.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;





@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;
//	@NotBlank
	private String accountType;
//	@NotBlank
	private Long balance;
//	@NotBlank
	private Integer customerId;
	
		
	}


