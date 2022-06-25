package com.hotel.service.amenities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.service.amenities.model.Amenities;


@Repository
public interface AmenitiesRepository extends JpaRepository<Amenities, Long>{

}
