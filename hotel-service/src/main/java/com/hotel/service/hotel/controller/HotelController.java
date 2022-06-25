package com.hotel.service.hotel.controller;

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

import com.hotel.service.hotel.dto.HotelRequest;
import com.hotel.service.hotel.dto.HotelResponce;
import com.hotel.service.hotel.model.Hotel;
import com.hotel.service.hotel.service.HotelServices;



@RestController
@RequestMapping("/api/")
public class HotelController {
	
	@Autowired
	HotelServices hotelService;
	
	@PostMapping("/cretenew")
	public ResponseEntity<HotelResponce> insertNewHotel(@RequestBody HotelRequest resquest){ 
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Hotel hotel=mapper.map(resquest, Hotel.class);
		hotel=hotelService.insertNewHotel(hotel);
		HotelResponce hr=mapper.map(hotel, HotelResponce.class);
		
		return new ResponseEntity<>(hr,HttpStatus.CREATED);
		
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<HotelResponce> updateHotel(@RequestBody HotelRequest hrequest){
		HotelResponce hr= new HotelResponce();
		if(hrequest.getHotelId()!=null) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Hotel hotel=mapper.map(hrequest, Hotel.class);
		hotel=hotelService.updateHotel(hrequest.getHotelId(), hotel);
		 hr=mapper.map(hotel, HotelResponce.class);
		}
		return new ResponseEntity<>(hr,HttpStatus.OK);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<HotelResponce>> getAllHotel(){
		List<HotelResponce>  list= convertEntityToDTOList();
		return new ResponseEntity<>(list,HttpStatus.OK);
				
	}
	
	 public List<HotelResponce> convertEntityToDTOList(){
		 ModelMapper modelmapper = new ModelMapper();
         List<Hotel> post = hotelService.getHotelAll();
         Type listType = new TypeToken<List<HotelResponce>>(){}.getType();
         List<HotelResponce> postDTOList = modelmapper.map(post, listType);
         return postDTOList;
     }
	 
	// @GetMapping("getByName/{name}")
		public List<HotelResponce> getHotelByName(String name){
		 ModelMapper modelmapper = new ModelMapper();
		 List<Hotel> post = hotelService.findHotelbyName(name);
		 Type listType = new TypeToken<List<HotelResponce>>(){}.getType();
         List<HotelResponce> postDTOList = modelmapper.map(post, listType);
         return postDTOList;
	 }
		@GetMapping("getByName/{name}")
		public ResponseEntity<List<HotelResponce>> getnameHotel(@PathVariable String name){
			List<HotelResponce>  list= getHotelByName(name);
			return new ResponseEntity<>(list,HttpStatus.OK);
					
		}
		@GetMapping("getByid/{hotelid}")
		public ResponseEntity<HotelResponce> getHotelById(@PathVariable Long hotelid){
			HotelResponce  ht= getHotelByID(hotelid);
			return new ResponseEntity<>(ht,HttpStatus.OK);
					
		}
		public HotelResponce getHotelByID(Long hotelid) {
			ModelMapper modelmapper = new ModelMapper();
			modelmapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			Hotel hotel=hotelService.findHotelbyID(hotelid);
			HotelResponce rs=modelmapper.map(hotel, HotelResponce.class);
			return rs;
		}
}
