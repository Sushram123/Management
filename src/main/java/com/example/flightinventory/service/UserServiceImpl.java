package com.example.flightinventory.service;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.flightinventory.model.User;

@Component
public class UserServiceImpl implements UserService{
	private Map<String, User> users = new HashMap<>();

	@Override
	public User addUser(String userId, String name, double funds) {
	 
	 if(users.containsKey(userId)) {
		 throw new 
		 IllegalArgumentException("User with Id " + userId + " already exists.");
		
	 }
	 User user = new User(userId, name, funds);
	 users.put(userId, user);
	 
		return user;
		
	}
	@Override
    public User getUserById(String userId) {
        return users.get(userId);
    }
	
}
