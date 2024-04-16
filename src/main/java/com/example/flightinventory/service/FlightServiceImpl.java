 package com.example.flightinventory.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.flightinventory.model.Flight;
import com.example.flightinventory.model.FlightBookingRequest;
import com.example.flightinventory.repository.FlightRepository;
import com.org.model.Booking;
import org.apache.commons.lang3.StringUtils;

public class FlightServiceImpl implements FlightService {
	private final Map<String, Flight>
	flights = new HashMap<>();

	private FlightRepository flightRepository;
	@Override
	public List<Flight> searchFlight(String from, String to, String departDate, int paxCount) {
		List<Flight> availableFlights = new ArrayList<>();
		for (Flight flight : flights.values()) {
			if (flight.getFrom().equals(from) && flight.getTo().equals(to) && flight.getDepartDate().equals(departDate) && flight.getAvailableSeats()>= paxCount) {
				availableFlights.add(flight);
			}
		}
		return availableFlights;
		
	}

	@Override
	public String bookFlight(String userID, String flightNumber, String departDate, String fareType,
			List<String> seats) {
		Flight flight = flights.get(flightNumber);
		if(flight == null) {
			throw new RuntimeException (" Flight not found with fightNumber:" + flightNumber);
			
		}
		if(! flight.getDepartDate().equals(departDate)) {
			throw new RuntimeException("Department date doesn't match for the flight");
		}
		Map<String, List<String>> fareTypes = flight.getFareTypes();
		if(fareTypes == null || ! fareTypes.containsKey(fareTypes)) {
			throw new RuntimeException ("Invalid fare type selected");
		}
			List<String> availableSeats = flight.getFareTypes().get(fareType);
			if(availableSeats == null || ! availableSeats.containsAll(seats)) {
				throw new RuntimeException("seats are not avaliable for the selected fare type");
				
			}
			for(String seat: seats) {
				 availableSeats.remove(seats);
				
			}
			
			flight.setAvailableSeats(flight.getAvailableSeats()- seats.size());
		

		return "Booking successful";
	}
	
	
	//another mathod at 3:11pm
	@Override
	public List<Flight> searchFlights(Flight request) {
	    // Implement logic to search flights based on the request criteria
	    String from = request.getFrom();
	    String to = request.getTo();
	    String departDate = request.getDepartDate();
	    int paxCount = request.getPaxCount();

	    // Example logic using in-memory flights data
	    List<Flight> foundFlights = new ArrayList<>();
	    for (Flight flight : flights.values()) {
	        if (flight.getFrom().equals(from)
	                && flight.getTo().equals(to)
	                && flight.getDepartDate().equals(departDate)
	                && flight.getAvailableSeats() >= paxCount) {
	            foundFlights.add(flight);
	        }
	    }

	    return foundFlights;
	}

	@Override
	public boolean bookFlight(FlightBookingRequest request) {
		// TODO Auto-generated method stub
		return false;
	}
}




//@Override
//public boolean bookFlight(FlightBookingRequest request) {
//    try {
//        // Validate the booking request
//        if (!isValidBookingRequest(request)) {
//            return false; // Invalid request
//        }
//
//        // Check seat availability
//        Flight flight = flightRepository.findByFlightId(request.getFlightId());
//        if (flight == null || flight.getPaxCount() < request.getPassengerNames().length) {
//            return false; // Seats not available
//        }
//
//        // Update seat count
//        int remainingSeats = flight.getPaxCount() - request.getPassengerNames().length;
//        flight.setPaxCount(remainingSeats);
//        flightRepository.save(flight);
//
//        // Save booking details to database (assuming you have a BookingRepository)
//        Booking booking = new Booking();
//        booking.setFlightId(request.getFlightId());
//        booking.setPassengerNames(Arrays.asList(request.getPassengerNames()));
//        // Set other booking details like booking date, user details, etc.
//        bookingRepository.save(booking);
//
//        return true; // Booking successful
//    } catch (Exception e) {
//        // Handle exceptions, log error messages, etc.
//        e.printStackTrace();
//        return false; // Booking failed
//    }
//}
//
//private boolean isValidBookingRequest(FlightBookingRequest request) {
//    // Implement validation logic here, e.g., check if flightId and passenger names are provided
//    return request != null && StringUtils.isNotBlank(request.getFlightId())
//            && request.getPassengerNames() != null && request.getPassengerNames().length > 0;
//}
//}
	// checking for myself
	

//	@Override
//	public String bookFlight(String from, String to, String departDate, int pax) {
//		Flight flight = flights.get(from);
//		if(flight == null) {
//			throw new RuntimeException (" Flight not found with fightNumber:" + from);
//			
//		}
//		if(! flight.getDepartDate().equals(departDate)) {
//			throw new RuntimeException("Department date doesn't match for the flight");
//		}
//		Map<String, List<String>> paxCount1 = flight.getPaxCount();
//		if(paxCount1 == null || ! paxCount1.containsKey(paxCount1)) {
//			throw new RuntimeException ("Invalid fare type selected");
//		}
//			List<String> availableSeats = flight.getFareTypes().get(paxCount1);
//			if(availableSeats == null || ! availableSeats.containsAll(pax)) {
//				throw new RuntimeException("seats are not avaliable for the selected fare type");
//				
//			}
//			for(String seat: pax) {
//				paxCount.remove(paxCou);
//				
//			}
//			
//			flight.setAvailableSeats(flight.getAvailableSeats()- paxCount.size());
//		
//
//		return "Booking successful";
//	}
//  
//
//}



