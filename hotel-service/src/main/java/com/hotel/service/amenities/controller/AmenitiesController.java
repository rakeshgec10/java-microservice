package com.hotel.service.amenities.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.amenities.dto.AmenitiesRequest;
import com.hotel.service.amenities.dto.AmentiesResponce;
import com.hotel.service.amenities.model.Amenities;
import com.hotel.service.amenities.service.AmenitiesService;




@RestController
@RequestMapping("/api/")
public class AmenitiesController {
	
	@Autowired
	AmenitiesService amenitiesService;
	
	@PostMapping("/newAmenties")
	public ResponseEntity<AmentiesResponce> insertNewAmenties(@RequestBody AmenitiesRequest resquest){ 
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Amenities amenities=mapper.map(resquest, Amenities.class);
		amenities=amenitiesService.insertNewAmenities(amenities);
		AmentiesResponce am=mapper.map(amenities, AmentiesResponce.class);
		
		return new ResponseEntity<>(am,HttpStatus.CREATED);
		
	}
	@PutMapping("/amenties/{id}")
	public ResponseEntity<AmentiesResponce> updateAmenties(@RequestBody AmenitiesRequest hrequest){
		AmentiesResponce hr= new AmentiesResponce();
		if(hrequest.getAmenitiesid()!=null) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Amenities am=mapper.map(hrequest, Amenities.class);
		am=amenitiesService.updateAmenities(am);
		 hr=mapper.map(am, AmentiesResponce.class);
		}
		return new ResponseEntity<>(hr,HttpStatus.OK);
	}
	@GetMapping("/getAllAmenties")
	public ResponseEntity<List<AmentiesResponce>> getAllHotel(){
		List<AmentiesResponce>  list= convertEntityToDTOList();
		return new ResponseEntity<>(list,HttpStatus.OK);
				
	}
	
	 public List<AmentiesResponce> convertEntityToDTOList(){
		 ModelMapper modelmapper = new ModelMapper();
         List<Amenities> post = amenitiesService.getAllAmenities();
         Type listType = new TypeToken<List<AmentiesResponce>>(){}.getType();
         List<AmentiesResponce> postDTOList = modelmapper.map(post, listType);
         return postDTOList;
     }
	 
	
	
		@GetMapping("getAmentiesByid/{amentiesid}")
		public ResponseEntity<AmentiesResponce> getHotelById(@PathVariable Long amentiesid){
			AmentiesResponce  ht= getHotelByID(amentiesid);
			return new ResponseEntity<>(ht,HttpStatus.OK);
					
		}
		public AmentiesResponce getHotelByID(Long amentiesid) {
			ModelMapper modelmapper = new ModelMapper();
			modelmapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			Amenities hotel=amenitiesService.getAmenitiesById(amentiesid);
			AmentiesResponce rs=modelmapper.map(hotel, AmentiesResponce.class);
			return rs;
		}
}
