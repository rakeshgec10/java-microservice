package com.hotel.service.location.service;

import java.util.List;

import com.hotel.service.location.model.Location;



public interface LocationService {

	Location insertNewLocation(Location location);
	
	Location updateLocation(Location location);
	
	
	void deleteLocation(Long locationid);
	
	List<Location> getAllLocation();
	
	Location getLocationByCountryCode(String countrycode );
	
}
