package com.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entity.TransactionStatus;

public interface TransactionStatusRepo extends JpaRepository<TransactionStatus, Integer> {

}
