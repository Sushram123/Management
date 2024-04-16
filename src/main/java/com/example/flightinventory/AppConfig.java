package com.example.flightinventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.flightinventory.service.BookingService;
import com.example.flightinventory.service.BookingServiceImpl;

@Configuration
public class AppConfig {
	@Bean
	public BookingService bookingService() {
		return new BookingServiceImpl();
	}


}
