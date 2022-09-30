package com.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entity.AccountCreationStatus;

public interface AccountCreationStatusRepo extends JpaRepository<AccountCreationStatus, Integer> {

}
