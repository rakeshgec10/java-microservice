package com.hotel.service.room.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.room.model.RoomFacility;
import com.hotel.service.room.repository.RoomFacilityRepository;

@Service
public class RoomFaclitieyService {
	
	@Autowired
	RoomFacilityRepository rfr;
	
	public RoomFacility newRoomFaclitiey(RoomFacility rf) {
		return rfr.save(rf);
		
	}
	

}
