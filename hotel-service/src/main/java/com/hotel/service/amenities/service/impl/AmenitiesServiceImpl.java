package com.hotel.service.amenities.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.amenities.model.Amenities;
import com.hotel.service.amenities.repository.AmenitiesRepository;
import com.hotel.service.amenities.service.AmenitiesService;



@Service
public class AmenitiesServiceImpl implements AmenitiesService{
	
	@Autowired
	AmenitiesRepository amenitiesrepo;

	@Override
	public Amenities insertNewAmenities(Amenities amenities) {
		
		return amenitiesrepo.save(amenities);
	}

	@Override
	public Amenities updateAmenities(Amenities amenities) {
		Amenities ams=getAmenitiesById(amenities.getAmenitiesid());
		ams.setDisplyimage(amenities.getDisplyimage());
		ams.setInfo(amenities.getInfo());
		return amenitiesrepo.saveAndFlush(ams);
	}

	@Override
	public void deleteAmenities(Long amenitiesid) {
		
		
	}

	@Override
	public List<Amenities> getAllAmenities() {
		// TODO Auto-generated method stub
		return amenitiesrepo.findAll();
	}

	@Override
	public Amenities getAmenitiesByName(String name) {
		
		return null;
	}

	@Override
	public Amenities getAmenitiesById(Long id) {
		
		return amenitiesrepo.getReferenceById(id);
	}

}
