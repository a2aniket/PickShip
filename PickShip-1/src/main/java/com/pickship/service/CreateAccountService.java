package com.pickship.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pickship.entity.CreateAccount;
import com.pickship.entity.OtpRecord;
import com.pickship.repo.CreateAccountRepo;
import com.pickship.repo.OtpRecordRepo;

@Service
public class CreateAccountService
{
    @Autowired
    CreateAccountRepo createAccountRepo;

    @Autowired
    OtpRecordRepo otpRecordRepo;

    public CreateAccount findByPhoneNumber(long phoneNumber)
    {
	return createAccountRepo.findByPhoneNumber(phoneNumber);

    }

    public String createAccount(CreateAccount getNumber, Long phoneNumber)
    {
	int number;
	OtpRecord otpRecord = new OtpRecord();
	Random rnd = new Random();
	if (getNumber == null)
	{
	    // accountRepo.save(account);
	    number = rnd.nextInt(999999);
	    otpRecord.setId(rnd.nextInt(999999));
	    otpRecord.setOtp(number);
	    System.out.println(phoneNumber);
	    otpRecord.setOtpPhoneNumber(phoneNumber);
	    otpRecordRepo.save(otpRecord);
	    return "new" + number;
	} else
	{
	    number = rnd.nextInt(999999);
	    otpRecord.setId(rnd.nextInt(999999));
	    otpRecord.setOtp(number);
	    otpRecord.setOtpPhoneNumber(phoneNumber);
	    otpRecordRepo.save(otpRecord);
	    return "old" + number;
	}

    }
}
