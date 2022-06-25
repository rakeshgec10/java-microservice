package com.hotel.service.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.hotel.model.Hotel;
import com.hotel.service.hotel.repository.HotelRepository;
import com.hotel.service.hotel.service.HotelServices;
import com.hotel.service.validations.HotelUtils;

@Service
public class HotelServicesImpl implements HotelServices{
	
	@Autowired
	HotelRepository hotelRepo;
	@Autowired
	HotelUtils hotelutils;

	@Override
	public Hotel insertNewHotel(Hotel hotel) {
	String htvalidation=HotelUtils.hotelBeforeSave(hotel);	
	Hotel hts=null;
	if(htvalidation.equals("pass")) {
		hts=hotelRepo.save(hotel);
	}
		return hts;
	}

	@Override
	public Hotel updateHotel(Long hotelid, Hotel hotel) {
		Hotel hts=findHotelbyID(hotelid);
		if(hts!=null) {
			String htvalidation=HotelUtils.hotelBeforeSave(hotel);	
			if(htvalidation.equals("pass")) {
			hts.setHotelName(hotel.getHotelName());
			hts.setPin(hotel.getPin());
			hts.setDescription(hotel.getDescription());
			hotelRepo.save(hts);
			}
			
		}
		return hts;
	}

	@Override
	public List<Hotel> getHotelAll() {
		
		return hotelRepo.findAll();
	}

	@Override
	public List<Hotel> findHotelbyName(String hotelname) {
		List<Hotel> listH=hotelRepo.findHotelbyName(hotelname);
		return listH;
	}

	@Override
	public Hotel findHotelbyID(Long hotelid) {
		Hotel hts=hotelRepo.getReferenceById(hotelid);
		
		return hts;
	}

	@Override
	public void deleteHotel(Long hotelid) {
		Hotel hts=findHotelbyID(hotelid);
		if(hts!=null) {
			hotelRepo.delete(hts);
		}
		
	}

}
