package com.account.service;

import java.util.Date;
import java.util.List;

import com.account.entity.Statement;

public interface IstatementService {

	List<Statement> getbyaccountId(Integer accountId, Date from_date, Date to_date);

	Statement saveStatement(Statement statement);

}
