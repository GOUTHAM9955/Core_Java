package com.launch.map;

import java.sql.Date;

// If we want to work with date type of data we have date class which is available in util and sql package
// From Java 8 we have a new API called joda api which is is in time package to work with data type

// We have to pass micro seconds data into Date class in SQl package while initializing it and it will return only date in return

public class DateLauncher {

	public static void main(String[] args) {
		// Date time using util package
		/*
		 * Date datetime = new Date(); System.out.println(datetime);
		 * 
		 * int year = datetime.getYear(); System.out.println(year); long timeinMS =
		 * datetime.getTime();
		 * 
		 * System.out.println(timeinMS);
		 */
		
		//Date time using SQL package
		Date datetime = new Date(1719763914008L);
		System.out.println(datetime);
	}

}
