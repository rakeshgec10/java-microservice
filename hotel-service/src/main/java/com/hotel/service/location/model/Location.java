package com.hotel.service.location.model;

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
@Table(name="location")
@Setter
@Getter
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="locationid")
	@PrimaryKeyJoinColumn
	private Long locationid;
	
	@Column(unique=true)
	private String countrycode;
	
	@Column(unique=true)
	private String pin;
	private String statecode;
	


}
