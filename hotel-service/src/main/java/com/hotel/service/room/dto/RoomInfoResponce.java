package com.hotel.service.room.dto;



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
public class RoomInfoResponce{
	
	private Long roomid;
	
	private String hotelid;

	private String roomfacilityid;
	
private String roominfo;
	
	private String currentprice;
	
	private String discount;
}
