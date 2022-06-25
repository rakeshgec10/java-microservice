package com.hotel.service.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.service.location.model.Location;


@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{

	@Query(value = "SELECT * FROM Location WHERE countrycode = ?1", nativeQuery = true)
	Location getLocationByCountryCode(String countrycode);
}
