package com.pickship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    Long hotelId;
    String hotelName;
    String hotelAddress;
    Long hotelPhoneNumber;
    String hotelPhoto;
    String hotelType;
    Boolean offer;
    int offPersent;

    public Long getHotelId() {
	return hotelId;
    }

    public void setHotelId(Long hotelId) {
	this.hotelId = hotelId;
    }

    public String getHotelName() {
	return hotelName;
    }

    public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
    }

    public String getHotelAddress() {
	return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
	this.hotelAddress = hotelAddress;
    }

    public Long getHotelPhoneNumber() {
	return hotelPhoneNumber;
    }

    public void setHotelPhoneNumber(Long hotelPhoneNumber) {
	this.hotelPhoneNumber = hotelPhoneNumber;
    }

    public String getHotelPhoto() {
	return hotelPhoto;
    }

    public void setHotelPhoto(String hotelPhoto) {
	this.hotelPhoto = hotelPhoto;
    }

    public String getHotelType() {
	return hotelType;
    }

    public void setHotelType(String hotelType) {
	this.hotelType = hotelType;
    }

    public Boolean getOffer() {
	return offer;
    }

    public void setOffer(Boolean offer) {
	this.offer = offer;
    }

    public int getOffPersent() {
	return offPersent;
    }

    public void setOffPersent(int offPersent) {
	this.offPersent = offPersent;
    }

    @Override
    public String toString() {
	return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
		+ ", hotelPhoneNumber=" + hotelPhoneNumber + ", hotelPhoto=" + hotelPhoto + ", hotelType=" + hotelType
		+ ", offer=" + offer + ", offPersent=" + offPersent + "]";
    }

}
