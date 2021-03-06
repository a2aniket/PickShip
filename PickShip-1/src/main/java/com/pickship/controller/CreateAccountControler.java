package com.pickship.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pickship.entity.CreateAccount;
import com.pickship.entity.OtpRecord;
import com.pickship.repo.CreateAccountRepo;
import com.pickship.repo.OtpRecordRepo;
import com.pickship.service.CreateAccountService;

@RestController
@RequestMapping("/parcelseva/v1/")
public class CreateAccountControler
{

    @Autowired
    CreateAccountService accountService;

    @Autowired
    OtpRecordRepo otpRecordRepo;
  
    @PostMapping()
    public String createAccount(@RequestBody CreateAccount account)

    {
	CreateAccount getNumber = accountService.findByPhoneNumber(account.getPhoneNumber());
	Long phoneNumber = account.getPhoneNumber();
	return accountService.createAccount(getNumber,phoneNumber);

    }

}