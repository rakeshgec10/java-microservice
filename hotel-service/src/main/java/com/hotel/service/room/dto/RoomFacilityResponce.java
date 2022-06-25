package com.hotel.service.room.dto;

import java.util.Set;



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
public class RoomFacilityResponce {

	
	private Long roomfacilityid;
	
	private Long roomid;
	
	private Set<String> amentiesid;
}
