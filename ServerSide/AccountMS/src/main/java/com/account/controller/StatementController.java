package com.account.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.account.entity.Statement;
import com.account.service.IstatementService;



@RestController
public class StatementController {
@Autowired
IstatementService istatementService;
// get Account statement
@GetMapping("/getstatement/{accountId}/{from_date}/{to_date}")
public List<Statement> getbyaccountId(@PathVariable Integer accountId, @PathVariable("from_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date from_date, @PathVariable("to_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date to_date){
	List<Statement> statements = istatementService.getbyaccountId(accountId,from_date,to_date);
	return statements;
}
}
