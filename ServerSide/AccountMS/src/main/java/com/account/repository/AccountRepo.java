package com.account.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {
    
	@Query(value = "SELECT * FROM bank.account WHERE customer_id=?1", nativeQuery = true)
	List<Account> findBycustomerId(Integer customerId);
	
	@Query(value = "SELECT * FROM bank.account WHERE balance=?1", nativeQuery = true)
	Long findBybalance(Long balance);
	
	
	

}
