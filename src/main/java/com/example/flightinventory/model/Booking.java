package com.example.flightinventory.model;

import java.util.List;

public class Booking {
	private String bookingId;
	private String userId;
	private String flightNumber;
	private String departDate;
	private String fareType;
	private String seats;
	
	

	


	public String getBookingId() {
		return bookingId;
	}



	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	public String getDepartDate() {
		return departDate;
	}



	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}



	public String getFareType() {
		return fareType;
	}



	public void setFareType(String fareType) {
		this.fareType = fareType;
	}



	public String getSeats() {
		return seats;
	}



	public void setSeats(String seats) {
		this.seats = seats;
	}

	
	


	public Booking(String bookingId, String userId, String flightNumber, String departDate, String fareType,
			String seats) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightNumber = flightNumber;
		this.departDate = departDate;
		this.fareType = fareType;
		this.seats = seats;
	}



	public void put(String bookingId2, Booking booking) {
		// TODO Auto-generated method stub
		
	}
	
	

}
