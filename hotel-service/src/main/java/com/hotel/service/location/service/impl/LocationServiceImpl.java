package com.hotel.service.location.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.location.model.Location;
import com.hotel.service.location.repository.LocationRepository;
import com.hotel.service.location.service.LocationService;



@Service
public class LocationServiceImpl implements LocationService{
	
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location insertNewLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		
		return null;
	}

	@Override
	public void deleteLocation(Long locationid) {
		Location loction=locationRepository.getReferenceById(locationid);
		 locationRepository.delete(loction);
	}

	@Override
	public List<Location> getAllLocation() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Override
	public Location getLocationByCountryCode(String countrycode) {
		
		return locationRepository.getLocationByCountryCode(countrycode);
	}

}
