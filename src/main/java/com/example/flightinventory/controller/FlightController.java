package com.example.flightinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightinventory.model.Flight;
import com.example.flightinventory.model.FlightBookingRequest;
import com.example.flightinventory.service.FlightService;

@RestController
public class FlightController {
	
	private final FlightService flightService;
	
	@Autowired
	public FlightController(FlightService flightService) {
		this.flightService = flightService;
		
	}
	
	@GetMapping("/flight")
	public List<Flight> searchFlight(
			@RequestParam String from,
			@RequestParam String to,
			@RequestParam String departDate,
			@RequestParam int paxCount){
		return flightService.searchFlight(from, to, departDate, paxCount);
		
	}
	@PostMapping("/booking")
	public String bookFlight(
		@RequestParam String userId,
		@RequestParam String flightName,
		@RequestParam String departDate,
		@RequestParam String fareType,
		@RequestParam List<String> seats) {
		return flightService.bookFlight(userId, flightName, departDate, fareType, seats);
		
	}

	
	
	
	@PostMapping("/search")
	public ResponseEntity<List<Flight>> searchFlights(@RequestBody Flight request) {
	    List<Flight> foundFlights = flightService.searchFlights(request);
	    return new ResponseEntity<>(foundFlights, HttpStatus.OK);
	}

	//another method at 3:11pm
	
	@PostMapping("/flight/book")
    public ResponseEntity<String> bookFlight(@RequestBody FlightBookingRequest request) {
        if (flightService.bookFlight(request)) {
            return ResponseEntity.ok("Booking successful");
        } else {
            return ResponseEntity.badRequest().body("Booking failed");
        }
    }
}
