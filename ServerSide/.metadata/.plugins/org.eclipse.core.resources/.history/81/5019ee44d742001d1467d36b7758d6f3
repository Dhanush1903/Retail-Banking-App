package com.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.account.entity.Statement;

public interface StatementRepo extends JpaRepository<Statement, Integer> {
	@Query(value = "SELECT * FROM bank.statement WHERE account_id=?1", nativeQuery = true)
	List<Statement> findByaccountId(Integer accountId);

}
