package com.example.flightinventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.flightinventory.service.FlightService;
import com.example.flightinventory.service.FlightServiceImpl;

@Configuration
public class flightConfig {
	
	
		@Bean
		public FlightService flightService() {
			return new FlightServiceImpl();
		}

}

