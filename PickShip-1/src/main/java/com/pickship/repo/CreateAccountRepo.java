package com.pickship.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pickship.entity.CreateAccount;

public interface CreateAccountRepo extends JpaRepository<CreateAccount, Integer> {
	
	CreateAccount findByPhoneNumber(Long number);
}
