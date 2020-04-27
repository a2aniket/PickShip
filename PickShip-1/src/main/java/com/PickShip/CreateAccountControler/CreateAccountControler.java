package com.PickShip.CreateAccountControler;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PickShip.CreateAccount.CreateAccount;
import com.PickShip.CreateAccountRepo.CreateAccountRepo;
import com.PickShip.OtpRecord.OtpRecord;
import com.PickShip.OtpRecordRepo.OtpRecordRepo;

@RestController
@RequestMapping("/")
public class CreateAccountControler {
	
	@Autowired
	CreateAccountRepo accountRepo;
	@Autowired
	OtpRecordRepo otpRecordRepo; 
	OtpRecord otpRecord=new OtpRecord();
	Random rnd = new Random();
	int number;
	@PostMapping("/home")
	public String createAccount (CreateAccount account)
	{
		CreateAccount getNumber=accountRepo.findByPhoneNumber(account.getPhoneNumber());
		Long phoneNumber=account.getPhoneNumber();
		
		if(getNumber==null)
		{	
			accountRepo.save(account);
		    number = rnd.nextInt(999999);
		    otpRecord.setId(rnd.nextInt(999999));
		    otpRecord.setOtp(number);
		    System.out.println(phoneNumber);
		    otpRecord.setOtpPhoneNumber(phoneNumber);
		    otpRecordRepo.save(otpRecord);
		    return "new"+number;
		}
		else
		{
			Random rnd = new Random();
		    number = rnd.nextInt(999999);
		    otpRecord.setId(rnd.nextInt(999999));
		    otpRecord.setOtp(number);
		    otpRecord.setOtpPhoneNumber(phoneNumber);
		    otpRecordRepo.save(otpRecord);
			return "old"+number;
		}
	}
	
}