package com.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@GetMapping("/getstatement/{accountId}")
public List<Statement> getbyaccountId(@PathVariable Integer accountId){
	List<Statement> statements = istatementService.getbyaccountId(accountId);
	return statements;
}
}