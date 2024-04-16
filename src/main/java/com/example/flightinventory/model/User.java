package com.example.flightinventory.model;


public class User {
	private String userId;
	private String name;
	private double funds;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	}
	public User(String userId, String name, double funds) {
		super();
		this.userId = userId;
		this.name = name;
		this.funds = funds;
	}
	
	
	

}
