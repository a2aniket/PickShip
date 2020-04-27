package com.PickShip.HotelControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.PickShip.Hotel.Hotel;
import com.PickShip.HotelRepo.HotelRepo;

@RestControllerAdvice
@RequestMapping("/hotel")
public class HotelControler {
	
	@Autowired
	HotelRepo hotelRepo;
	
	@PostMapping("/add")
	public Hotel addHotel(Hotel hotel)
	{
		return hotelRepo.save(hotel);
	}
	
	@GetMapping("/showhotel")
	public List<Hotel> showHotel()
	{
		return hotelRepo.findAll();
	}
	
	@GetMapping("/offerhotel")
	public List<Hotel> showHotelByOffer()
	{
		return hotelRepo.getHotelByOffer();
	}
	
	@GetMapping("/noofferhotel")
	public List<Hotel> showHotelNoOfferHotel()
	{
		return hotelRepo.getHotelByNoOffer();
	}
	
	
}
