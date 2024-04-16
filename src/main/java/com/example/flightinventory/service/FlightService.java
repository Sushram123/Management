package com.example.flightinventory.service;

import java.util.List;
import com.example.flightinventory.model.*;

public interface FlightService {
	 List<Flight> searchFlights(Flight request);

	List<Flight> searchFlight(String from, String to, String departDate, int paxCount );
  String bookFlight(String userID, String flightNumber, String departDate, String fareType, List<String> seats);
  
  
  boolean bookFlight(FlightBookingRequest request);

//String bookFlight(String from, String to, String departDate, int paxCount);

}
