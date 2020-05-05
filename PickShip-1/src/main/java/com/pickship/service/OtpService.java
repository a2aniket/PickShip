package com.pickship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pickship.entity.OtpRecord;
import com.pickship.repo.OtpRecordRepo;

@Service
public class OtpService
{
    @Autowired
    OtpRecordRepo otpRecordRepo;

    public boolean verifyOtp(OtpRecord otpRecord)
    {
	OtpRecord phoneNumber = otpRecordRepo.findByOtpPhone(otpRecord.getOtpPhoneNumber(), otpRecord.getOtp());
	Long otpPhoneNumber = otpRecord.getOtpPhoneNumber();
	System.out.println(otpPhoneNumber);
	if (phoneNumber == null)
	    return false;
	else
	{
	    otpRecordRepo.deleteByPhone(otpPhoneNumber);
	    return true;

	}
    }
}
