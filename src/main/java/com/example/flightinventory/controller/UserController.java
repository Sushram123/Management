package com.example.flightinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightinventory.model.User;
import com.example.flightinventory.service.UserService;

@RestController
public class UserController {
	private final UserService userService;
	@Autowired
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user.getUserId(), user.getName(), user.getFunds());
		
	}
	 @GetMapping("/{userId}")
	    public ResponseEntity<User> getUserById(@PathVariable String userId) {
	        User user = userService.getUserById(userId);
	        if (user != null) {
	            return new ResponseEntity<>(user, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	}
	

