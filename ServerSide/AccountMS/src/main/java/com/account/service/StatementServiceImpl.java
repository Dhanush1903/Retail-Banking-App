package com.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.entity.Statement;
import com.account.repository.StatementRepo;

@Service
public class StatementServiceImpl implements IstatementService {
@Autowired
StatementRepo statementrepo;

@Override
public List<Statement> getbyaccountId(Integer accountId) {
	// TODO Auto-generated method stub
	return  statementrepo.findByaccountId(accountId);
}

}
