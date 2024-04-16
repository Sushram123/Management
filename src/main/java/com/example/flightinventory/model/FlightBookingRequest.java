package com.example.flightinventory.model;

public class FlightBookingRequest {
	
	private String flightId;
    private String[] passengerNames;
    
    
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String[] getPassengerNames() {
		return passengerNames;
	}
	public void setPassengerNames(String[] passengerNames) {
		this.passengerNames = passengerNames;
	}
    

}
