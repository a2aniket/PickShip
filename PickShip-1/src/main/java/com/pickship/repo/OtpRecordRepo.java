package com.pickship.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.pickship.entity.OtpRecord;

public interface OtpRecordRepo extends JpaRepository<OtpRecord, Integer>
{
    @Query("from OtpRecord where otpPhoneNumber=?1 and otp=?2 ")
    OtpRecord findByOtpPhone(Long phoneNumber, int otp);

    @Transactional
    @Modifying
    @Query("delete from OtpRecord where otpPhoneNumber=?1 ")
    int deleteByPhone(Long phoneNumber);

}
