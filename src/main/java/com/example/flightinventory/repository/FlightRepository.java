package com.example.flightinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightinventory.model.Flight;
//another method at 3:11pm
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    Flight findByFlightId(String flightId);
}
