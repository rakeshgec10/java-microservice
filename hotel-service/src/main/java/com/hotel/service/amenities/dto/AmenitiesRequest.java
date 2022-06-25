package com.hotel.service.amenities.dto;

import java.util.List;

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
public class AmenitiesRequest {
	

	
    	

private Long amenitiesid;

private String info;
private List<String> infodetails;

private String displyimage;

}
