package com.account.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.account.entity.Statement;
import com.account.service.IAccountService;
import com.account.service.IstatementService;

@ExtendWith(MockitoExtension.class)
public class StatementTestController {
	@Mock
	IstatementService statementService;
	
	@InjectMocks
	StatementController statementController;
	
	
	@Test
	void testgetbyaccountId () {
		Statement statement = new Statement();
		statement.setAccountId(1);
		statement.setFrom_date( new Date(2018,03,11));
		statement.setTo_date(new Date(2020,03,11));
		
		when(statementService.getbyaccountId(statement.getAccountId(),
				statement.getFrom_date(),
				statement.getTo_date())).thenReturn(new ArrayList<Statement>());
		assertEquals(new ArrayList<Statement>(), 
				statementController.getbyaccountId(statement.getAccountId(),
				statement.getFrom_date(),
				statement.getTo_date()));
	}

}
