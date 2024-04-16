package com.example.flightinventory.service;

import com.example.flightinventory.model.*;

public interface BookingService {
	Booking getBookingById(String bookingId);
	
	//String createBooking(String userId, String flightNumber,String departDate,String fareType,List<String> seats);
	
	Booking createBooking(Booking booking);
	
	
	//Booking getBookingById1(int bookingId);

}
