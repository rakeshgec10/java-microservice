package com.hotel.service.validations;

import org.springframework.stereotype.Component;

import com.hotel.service.model.Hotel;



@Component
public class HotelUtils {
	
	
	public static String hotelBeforeSave(Hotel hh) {
		
		if(hh.getHotelName()==null) {
			return "HotelName Can Not EMPTY";
		}
		if(hh.getPin()==null) {
			if(hh.getPin().length()>6) {
				return	"Hotel Pin Can Not Less then 6";
			}
			return "Hotel Pin Can Not EMPTY";
		}
		/*
		 * if(hh.getDescription()==null &&hh.getDescription().length()>50 ) { return
		 * "Hotel not less then 50 word"; }
		 */
		return "pass";
		
	}

}
