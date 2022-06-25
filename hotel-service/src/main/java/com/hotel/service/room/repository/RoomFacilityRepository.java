package com.hotel.service.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.service.room.model.RoomFacility;

@Repository
public interface RoomFacilityRepository extends JpaRepository<RoomFacility, Long>{

}
