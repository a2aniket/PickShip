package com.PickShip.OtpRecord;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OtpRecord {
	@Id
	int id;
	Long otpPhoneNumber;
	int otp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getOtpPhoneNumber() {
		return otpPhoneNumber;
	}
	public void setOtpPhoneNumber(Long otpPhoneNumber) {
		this.otpPhoneNumber = otpPhoneNumber;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	@Override
	public String toString() {
		return "OtpRecord [id=" + id + ", otpPhoneNumber=" + otpPhoneNumber + ", otp=" + otp + "]";
	}
	
}
