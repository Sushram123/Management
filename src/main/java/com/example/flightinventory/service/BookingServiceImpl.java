package com.example.flightinventory.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.example.flightinventory.model.*;


public class BookingServiceImpl implements BookingService{
	private final Map<String, Booking> 
	booking = new HashMap<>();

//	@Override
//	public Booking getBookingById(String bookingId) {
//		
//		return booking.get(bookingId);
// 	}

	
//	@Override
//	public String createBooking(String userId, String flightNumber, String departDate, String fareType,
//			List<String> seats) {
//		String bookingId = UUID.randomUUID().toString();
//		Booking booking = new Booking(bookingId, userId, flightNumber,departDate,fareType, seats);
//		booking.put(bookingId, booking);
//		return bookingId;
//	  }

// personal
//	
//	@Override
//	public Booking createBooking(Booking booking) {
//	        if (booking == null || booking.getUserId() == null || booking.getFlightNumber() == null || booking.getDepartDate() == null || booking.getFareType() == null || booking.getSeats() == null) {
//	            throw new IllegalArgumentException("Booking details can be null");
//	        }
//
//	        String bookingId = generateBookingId();
//	        booking.setBookingId(bookingId);
//	        booking.put(bookingId , booking);
//	        return booking;
//	    }
//
//	
//
//          private String generateBookingId() {
//            	 return UUID.randomUUID().toString();
//
//          }



//			@Override
//            public Booking getBookingById(String bookingId) {
//				System.out.println("entering");
//                if (!booking.containsKey(bookingId)) {
//                    throw new IllegalArgumentException("Booking not found with ID: " + bookingId);
//                }
//                return booking.get(bookingId);
//            }

//          @Override
//          public Booking getBookingById(String bookingId) {
//              System.out.println("Entering getBookingById");
//              if (!booking.containsKey(bookingId)) {
//                  throw new IllegalArgumentException("Booking not found with ID: " + bookingId);
//              }
//              System.out.println("Entering");
//              return booking.get(bookingId);
//          }
//      }
	
	@Override
    public Booking createBooking(Booking booking) {
        if (booking == null || booking.getUserId() == null || booking.getFlightNumber() == null ||
                booking.getDepartDate() == null || booking.getFareType() == null || booking.getSeats() == null) {
            throw new IllegalArgumentException("Booking details can't be null");
        }

        String bookingId = generateBookingId();
        booking.setBookingId(bookingId);
        booking.put(bookingId, booking); // Corrected to use bookings instead of booking
        return booking;
    }
	 private String generateBookingId() {
   	 return UUID.randomUUID().toString();

 }

	@Override
    public Booking getBookingById(String bookingId) {
        System.out.println("Entering getBookingById");
        if (!booking.containsKey(bookingId)) {
            throw new IllegalArgumentException("Booking not found with ID: " + bookingId);
        }
        return booking.get(bookingId);
    }
}	
          
	
	

