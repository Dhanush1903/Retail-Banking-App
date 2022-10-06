package com.account.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.entity.Statement;
import com.account.repository.StatementRepo;

@Service
public class StatementServiceImpl implements IstatementService {
@Autowired
StatementRepo statementrepo;


public List<Statement> getbyaccountId(Integer accountId, Date from_date, Date to_date) {
	// TODO Auto-generated method stub
	return statementrepo.findByaccountId(accountId);
}


@Override
public Statement saveStatement(Statement statement) {
	// TODO Auto-generated method stub
	
	return statementrepo.save(statement);
}

}
