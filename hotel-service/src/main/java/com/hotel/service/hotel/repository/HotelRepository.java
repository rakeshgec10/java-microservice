package com.hotel.service.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.service.hotel.model.Hotel;




@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
     @Query(value = "SELECT * FROM Hotel WHERE hotel_name = ?1", nativeQuery = true)
     List<Hotel> findHotelbyName(String hotelname);
	
	//@Query("select h from Hotel h where u.hotelid = ?1")
	//Hotel findHotelbyID(Long hotelid);

}
