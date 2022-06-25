package com.hotel.service.room.controller;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.room.dto.RoomFacilityRequest;
import com.hotel.service.room.dto.RoomFacilityResponce;
import com.hotel.service.room.dto.RoomInfoRequest;
import com.hotel.service.room.dto.RoomInfoResponce;
import com.hotel.service.room.model.RoomFacility;
import com.hotel.service.room.model.RoomInfo;
import com.hotel.service.room.service.RoomFaclitieyService;
import com.hotel.service.room.service.RoomInfoService;




@RestController
@RequestMapping("/api/")
public class RoomInfoController {
	
	@Autowired
	RoomInfoService ris;
	
	@Autowired
	RoomFaclitieyService rfs;
	
	
	 @PostMapping("/newroominfo")
	public RoomInfoResponce NewRoomInfo(@RequestBody RoomInfoRequest riff) {
		RoomInfo ruminfo=convertIntoEntity(riff);
		ruminfo=ris.inserRoomInfoDetails(ruminfo);
		RoomInfoResponce rrresp=convertIntoDTO(ruminfo);
		return rrresp;
		
		
	}

	private RoomInfo convertIntoEntity(RoomInfoRequest rr) {
		ModelMapper modelmapper = new ModelMapper();
		RoomInfo roomInfo=modelmapper.map(rr, RoomInfo.class);
		
		return roomInfo;
	}
	
	private RoomInfoResponce convertIntoDTO(RoomInfo info) {
		ModelMapper modelmapper = new ModelMapper();
		RoomInfoResponce rrrr=	modelmapper.map(info, RoomInfoResponce.class);
		
		return rrrr;
	}
	
	@PostMapping("/newroomfac")
		public RoomFacilityResponce newRoomFacility(@RequestBody RoomFacilityRequest req) {
			RoomFacility roomfac=convertIntoEntityRoomFac(req);
			roomfac=rfs.newRoomFaclitiey(roomfac);
			RoomFacilityResponce rr=convertIntoDTORoomFac(roomfac);
			return rr;
			
			
		}
		private RoomFacility convertIntoEntityRoomFac(RoomFacilityRequest rr) {
			ModelMapper modelmapper = new ModelMapper();
			RoomFacility roomInfo=modelmapper.map(rr, RoomFacility.class);		
			return roomInfo;
		}
		private RoomFacilityResponce convertIntoDTORoomFac(RoomFacility rr) {
			ModelMapper modelmapper = new ModelMapper();
			RoomFacilityResponce roomInfo=modelmapper.map(rr, RoomFacilityResponce.class);		
			return roomInfo;
		}

}
