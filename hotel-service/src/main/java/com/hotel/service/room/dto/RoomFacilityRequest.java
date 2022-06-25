package com.hotel.service.room.dto;

import java.util.Set;

import com.hotel.service.amenities.dto.AmenitiesRequest;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RoomFacilityRequest {

	
	private Long roomfacilityid;
	
	private RoomInfoRequest roomid;
	
	private Set<String> amentiesid;
}
