package com.hotel.service.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="hotel")
@Setter
@Getter
public class Hotel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4030745482143451503L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hotelid")
	@PrimaryKeyJoinColumn
	private Long hotelId;
	
	private String hotelName;
	
	private String pin;
	private String imageHotel;
	
	private String description;
	
	

}
