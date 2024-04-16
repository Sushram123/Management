package com.example.flightinventory.service;
import com.example.flightinventory.model.*;

public interface UserService {
	 User getUserById(String userId);
	User addUser(String userId, String name, double funds );

}
