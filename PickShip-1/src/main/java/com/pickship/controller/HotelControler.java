package com.pickship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pickship.entity.Hotel;
import com.pickship.repo.HotelRepo;
import com.pickship.service.HotelService;

@RestControllerAdvice
@RequestMapping("/hotel")
public class HotelControler
{

    @Autowired
    HotelRepo hotelRepo;

    @Autowired
    HotelService hotelService;

    @PostMapping("/add")
    public Hotel addHotel(Hotel hotel)
    {
	return hotelService.addHotel(hotel);
    }

    @GetMapping("/showhotel")
    public List<Hotel> showHotel()
    {
	return hotelService.showHotel();
    }

    @GetMapping("/offerhotel")
    public List<Hotel> showHotelByOffer()
    {
	return hotelService.showHotelByOffer();
    }

    @GetMapping("/noofferhotel")
    public List<Hotel> showHotelNoOfferHotel()
    {
	return hotelService.showHotelNoOfferHotel();
    }

}
