package com.hotel.service.room.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.hotel.service.hotel.model.Hotel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="roominfo")
@Setter
@Getter
public class RoomInfo {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roomid")
	@PrimaryKeyJoinColumn
	private Long roomid;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotelid", nullable = false)
	private Hotel hotelid;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roomfacilityid")
	private RoomFacility roomfacilityid;
	
	private String roominfo;
	
	private String currentprice;
	
	private String discount;
}
