package com.hotel.service.room.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.hotel.service.amenities.model.Amenities;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="roomfacility")
@Setter
@Getter
public class RoomFacility {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roomfacilityid")
	@PrimaryKeyJoinColumn
	private Long roomfacilityid;
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "roomid")
	private RoomInfo roomid;
	
	
	 @OneToMany(fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	private Set<Amenities> amentiesid;

}
