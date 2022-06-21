package com.hotel.service.service;

import java.util.List;

import com.hotel.service.model.Hotel;


public interface HotelServices {

	
	Hotel insertNewHotel(Hotel hotel);
	
	Hotel updateHotel(Long hotelid, Hotel hotel);
	
	List<Hotel> getHotelAll();
	
	List<Hotel> findHotelbyName(String hotelname);
	
	Hotel findHotelbyID(Long hotelid);
	
	void deleteHotel(Long hotelid);
	
	
	
}
