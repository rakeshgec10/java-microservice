package com.hotel.service.hotel.dto;

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
public class HotelRequest {
    
	private Long hotelId;
	private String hotelName;
	
	private String pin;
	private String imageHotel;
	
	private String description;

}
