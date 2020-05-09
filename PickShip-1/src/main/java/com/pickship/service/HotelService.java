package com.pickship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pickship.entity.Hotel;
import com.pickship.repo.HotelRepo;

@Service
public class HotelService
{
    @Autowired
    HotelRepo hotelRepo;

    public Hotel addHotel(Hotel hotel)
    {
	Hotel hotel2 =  hotelRepo.save(hotel);
	return hotel2;
    }

    public List<Hotel> showHotel()
    {
	return hotelRepo.findAll();
    }

    public List<Hotel> showHotelByOffer()
    {
	return hotelRepo.getHotelByOffer();
    }

    public List<Hotel> showHotelNoOfferHotel()
    {
	return hotelRepo.getHotelByNoOffer();
    }
}
