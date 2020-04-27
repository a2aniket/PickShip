package com.PickShip.CreateAccountRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PickShip.CreateAccount.CreateAccount;

public interface CreateAccountRepo extends JpaRepository<CreateAccount, Integer> {
	
	CreateAccount findByPhoneNumber(Long number);
}
