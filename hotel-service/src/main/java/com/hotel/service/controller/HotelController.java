package com.hotel.service.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.dto.HotelRequest;
import com.hotel.service.dto.HotelResponce;
import com.hotel.service.model.Hotel;
import com.hotel.service.service.HotelServices;

@RestController
@RequestMapping("/api/")
public class HotelController {
	
	@Autowired
	HotelServices hotelService;
	
	@PostMapping("/cretenew")
	public ResponseEntity<HotelResponce> insertNewHotel(@RequestBody HotelRequest resquest){ 
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Hotel hotel=mapper.map(resquest, Hotel.class);
		hotel=hotelService.insertNewHotel(hotel);
		HotelResponce hr=mapper.map(hotel, HotelResponce.class);
		
		return new ResponseEntity<>(hr,HttpStatus.CREATED);
		
	}
	

}
