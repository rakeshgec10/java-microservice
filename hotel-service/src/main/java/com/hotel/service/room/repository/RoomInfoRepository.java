package com.hotel.service.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.service.room.model.RoomInfo;

@Repository
public interface RoomInfoRepository extends JpaRepository<RoomInfo, Long>{

}
