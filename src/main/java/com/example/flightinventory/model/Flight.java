 package com.example.flightinventory.model;


import java.util.List;
import java.util.Map;


public class Flight {
	private String flightNumber;
	private String airline;
	private String from;
	private String to;
	private int availableSeats;
	private String departDate;
	private double departTime;
	private Map<String, List<String>> fareTypes;
	 private int paxCount;
	 
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getDepartDate() {
		return departDate;
	}
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	public double getDepartTime() {
		return departTime;
	}
	public void setDepartTime(double departTime) {
		this.departTime = departTime;
	}
	public Map<String, List<String>> getFareTypes() {
		return fareTypes;
	}
	public void setFareTypes(Map<String, List<String>> fareTypes) {
		this.fareTypes = fareTypes;
	}
	public Flight(String flightNumber, String airline, String from, String to, int availableSeats, String departDate,
			double departTime, Map<String, List<String>> fareTypes) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.from = from;
		this.to = to;
		this.availableSeats = availableSeats;
		this.departDate = departDate;
		this.departTime = departTime;
		this.fareTypes = fareTypes;
	}
	public int getPaxCount() {
		// TODO Auto-generated method stub
		return paxCount;
	}
	public void setPaxCount(int remainingSeats) {
		// TODO Auto-generated method stub
		this.paxCount = paxCount;
	}
	
	
	
	
   
}
