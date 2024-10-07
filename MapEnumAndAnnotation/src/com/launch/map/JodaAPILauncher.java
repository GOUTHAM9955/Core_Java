package com.launch.map;

import java.time.*;

// We have classes like LocalDate, LocalTime and LocalDateTime
// We cannot create objects of these classes directly instead we have to call static methods like now of these classes which creates objects 

public class JodaAPILauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println("date :"+ date);
		
		System.out.println("day of month :" +date.getDayOfMonth());
		System.out.println("day of year" +date.getDayOfYear());
		
		// To set date we can use "of" method
		
		LocalDate myBdy = LocalDate.of(1997, 9, 9);
		System.out.println("My age is :" + date.compareTo(myBdy)+" years");
		
	
	}

}
