package com.pickship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pickship.entity.Hotel;
import com.pickship.repo.HotelRepo;
import com.pickship.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelControler
{

    @Autowired
    HotelService hotelService;

    @PostMapping()
    public Hotel addHotel(@RequestBody Hotel hotel)
    {
	return hotelService.addHotel(hotel);
    }

    @GetMapping()
    public List<Hotel> showHotel()
    {
	return hotelService.showHotel();
    }

    @GetMapping("/offerHotels")
    public List<Hotel> showHotelByOffer()
    {
	return hotelService.showHotelByOffer();
    }

    @GetMapping("/nonOfferHotels")
    public List<Hotel> showHotelNoOfferHotel()
    {
	return hotelService.showHotelNoOfferHotel();
    }

}
