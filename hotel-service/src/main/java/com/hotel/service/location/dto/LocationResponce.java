package com.hotel.service.location.dto;

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
public class LocationResponce {
	
	private Long locationid;
	
	

	private String countrycode;
	
	
	private String pin;
	private String statecode;

}
