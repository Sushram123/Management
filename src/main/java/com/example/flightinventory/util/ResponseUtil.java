package com.example.flightinventory.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
	
	public static ResponseEntity<?> successsResponse(Object data){
		return ResponseEntity.ok(data);
	}
	public static ResponseEntity<?>
	errorResopnse(HttpStatus status, String message){
		return ResponseEntity.status(status).body(message);
		
	}

}
