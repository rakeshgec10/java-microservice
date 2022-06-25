package com.hotel.service.location.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.location.dto.LocationRequest;
import com.hotel.service.location.dto.LocationResponce;
import com.hotel.service.location.model.Location;
import com.hotel.service.location.service.LocationService;



@RestController
@RequestMapping("/api/")
public class LocationController {
	
	@Autowired
	LocationService ls;
	
	@PostMapping("/cretenewlocation")
	public ResponseEntity<LocationResponce> insertNewHotel(@RequestBody LocationRequest resquest){ 
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Location location=mapper.map(resquest, Location.class);
		location=ls.insertNewLocation(location);
		LocationResponce hr=mapper.map(location, LocationResponce.class);
		
		return new ResponseEntity<>(hr,HttpStatus.CREATED);
		
	}

}
