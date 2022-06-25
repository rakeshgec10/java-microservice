package com.hotel.service.amenities.service;

import java.util.List;

import com.hotel.service.amenities.model.Amenities;





public interface AmenitiesService {
	
	
	Amenities insertNewAmenities(Amenities amenities);
	
	Amenities updateAmenities(Amenities amenities);
	
	
	void deleteAmenities(Long amenitiesid);
	
	List<Amenities> getAllAmenities();
	
	Amenities getAmenitiesByName(String name );
	
	Amenities getAmenitiesById(Long id );
	
	

}
