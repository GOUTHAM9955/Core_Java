package com.launch.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* 
 To manage date objects we have two different type of packages
 	1) Date class from util package which is depricated
 	2) Date class form sql package: We use it when ever we are connecting with Database
 	3) From Java 8 we have Joda API which is in time package
 	

*/
public class DateTimeLauncher1 {

	public static void main(String[] args) {
		// We are implementing from joda API in time package
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		// We have multiple methods under this date object like
		System.out.println("Day Of Month: " + date.getDayOfMonth());
		System.out.println("Day Of year: " + date.getDayOfYear());
		System.out.println("Length Of Month: " + date.lengthOfMonth());
		
		// To set date
		LocalDate dob = LocalDate.of(1998, 06, 14);
		
		// Like date we have LocalTime
		LocalTime time = LocalTime.now();
		System.out.println("Local time :"+time);
		
		//If we want both we have LocalDateTime class
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println("Date time :" + dt);
		
		
		
		
	}

}
