package com.hotel.service.room.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.room.model.RoomFacility;
import com.hotel.service.room.model.RoomInfo;
import com.hotel.service.room.repository.RoomInfoRepository;



@Service
public class RoomInfoServiceImpl implements RoomInfoService{

	@Autowired
	RoomInfoRepository rinforepo;
	
	@Override
	public RoomInfo inserRoomInfoDetails(RoomInfo roominfo) {
		RoomFacility rf=roominfo.getRoomfacilityid();
		roominfo.setRoomfacilityid(rf);
		
		return rinforepo.save(roominfo);
	}
}
