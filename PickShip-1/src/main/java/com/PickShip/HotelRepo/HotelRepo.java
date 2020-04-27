package com.PickShip.HotelRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PickShip.Hotel.Hotel;

public interface HotelRepo extends JpaRepository<Hotel,Long> {
	@Query("from Hotel where offer=true order by offPersent")
	List<Hotel> getHotelByOffer();
	@Query("from Hotel where offer=false")
	List<Hotel> getHotelByNoOffer();
}
