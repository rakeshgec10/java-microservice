package com.hotel.service.amenities.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Amenities")
@Setter
@Getter
public class Amenities implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="amenitiesid")
	@PrimaryKeyJoinColumn
	private Long amenitiesid;
	
	private String info;
	
	@ElementCollection
	    @CollectionTable(name = "AmenitiesDetails", joinColumns = @JoinColumn(name = "info",referencedColumnName ="info"))
	    @Column(name = "infodetails")
	private List<String> infodetails;
	
	private String displyimage;
	

}
