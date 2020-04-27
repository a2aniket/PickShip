package com.PickShip.OtpControler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PickShip.OtpRecord.OtpRecord;
import com.PickShip.OtpRecordRepo.OtpRecordRepo;

@RestController
@RequestMapping("/verify")
public class OtpControler {
	
	@Autowired
	OtpRecordRepo otpRecordRepo;
	
	@PostMapping("/verifyotp")
	public boolean verifyOtp(OtpRecord otpRecord) {

		OtpRecord phoneNumber=otpRecordRepo.findByOtpPhone(otpRecord.getOtpPhoneNumber(),otpRecord.getOtp());
		Long otpPhoneNumber =otpRecord.getOtpPhoneNumber();
		System.out.println(otpPhoneNumber);
		if(phoneNumber==null)
			return false;
		else
		{
			otpRecordRepo.deleteByPhone(otpPhoneNumber);
			return true;
			
		}
}
}