package com.example.flightinventory.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD");
	public static String formateDate(LocalDate date) {
		return date.format(formatter);
		
	}
	public static LocalDate
	parseDate(String dateString) {
		return LocalDate.parse(dateString, formatter);
	}
	
}
