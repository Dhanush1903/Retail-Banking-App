package com.account.service;

import java.util.List;

import com.account.entity.Statement;

public interface IstatementService {

	List<Statement> getbyaccountId(Integer accountId);

}
