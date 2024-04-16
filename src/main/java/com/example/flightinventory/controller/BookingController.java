package com.example.flightinventory.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.flightinventory.model.Booking;

import com.example.flightinventory.service.BookingService;

@RestController
@RequestMapping("/book")
public class BookingController {
	
private final BookingService bookingService;

@Autowired

public BookingController(BookingService bookingservice) {
	this.bookingService = bookingservice;
	
}

// @GetMapping("/{bookingId}")
//public ResponseEntity<Booking> getBookingById(@PathVariable String bookingId) {
//     Booking booking = bookingService.getBookingById(bookingId);
//    if (booking != null) {
//        return new ResponseEntity<>(booking, HttpStatus.OK);
//    } else {
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//}

//user

// @GetMapping("/{bookingId}")
//public Booking getBookingById(@PathVariable String bookingId) {
// 	 System.out.println("print the success");
//	return bookingService.getBookingById(bookingId); 
//	
//}

//@GetMapping("/{bookingId}")
//public ResponseEntity<Booking> getBookingById(@PathVariable String bookingId) {
//    Booking booking = bookingService.getBookingById(bookingId);
//    if (booking != null) {
//        return new ResponseEntity<>(booking, HttpStatus.OK);
//    } else {
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//}

//
//@PostMapping
//public String createBooking(
//		@RequestParam String userId,
//		@RequestParam String flightNumber,
//		@RequestParam String departDate,
//		@RequestParam String fareType,
//		@RequestParam List<String> seats) {
// 	System.out.println("print the success");
//	return bookingService.createBooking(userId, flightNumber, departDate, fareType, seats);
//	
//}

// checking json
//@PostMapping("/booking")
//public ResponseEntity<Booking> createProduct(@RequestBody Booking booking) {
//    if (booking == null) {
//        return ResponseEntity.badRequest().build();
//    }
//    Booking createdProduct = bookingService.createBooking(booking);
//    return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
//}



//@GetMapping("/{bookingId}")
//public ResponseEntity<Object> getBooking(@PathVariable String bookingId) {
//    try {
//        Booking booking = bookingService.getBookingById(bookingId);
//        return new ResponseEntity<>(booking, HttpStatus.OK);
//    } catch (IllegalArgumentException e) {
//        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
//    }
//}
//}

//different

@PostMapping("/booking")
public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
    if (booking == null) {
        return ResponseEntity.badRequest().build();
    }

    try {
        Booking createdBooking = bookingService.createBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBooking);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}

@GetMapping("/{bookingId}")
public ResponseEntity<Object> getBooking(@PathVariable String bookingId) {
    try {
        Booking booking = bookingService.getBookingById(bookingId);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    } catch (IllegalArgumentException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
}