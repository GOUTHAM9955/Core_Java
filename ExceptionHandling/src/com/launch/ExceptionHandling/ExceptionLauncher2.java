package com.launch.ExceptionHandling;

import java.util.Scanner;

class Alpha{
	void myMethod2() {
		System.out.println("Application Started");
		System.out.println("Enter numarator :");
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		
		System.out.println("Enter denominator :");
		int val2 = scan.nextInt();
		
		System.out.println("Final value is: "+ val1/val2);
		System.out.println("Application terminated");
		scan.close();
		
	}
}

//UNDERSTANDING CONCEPT
/*
 * If an exception occured in the stack frame of above class object. The exception object will be send to 
 * 		JVM runtime by myMethod stack frame. The JVM runtime will now intially check myMethod for exception handler
 * 		Since it is not there it will check who is the caller of myMethod which is main method so the main method
 * 		stackframe is checked for exception handling and there too if we dont have excception handler now it will go
 * 		to default exception handler. 
 */

//Dunking the exception 
/*
 * In Java, using throws Exception in a method signature is not called "dunking the exception." 
 * 	Instead, it's simply declaring that the method may throw an Exception, which is a way of indicating 
 * 	that the method might cause an exception to be propagated up the call stack. This declaration forces 
 * 	any calling methods to either handle the exception using a try-catch block or declare that they also 
 * 	throw the exception.
 * 
 * DUNKING AN EXCEPTION IS NOT HANDILING THE EXCEPTION
 * If the method that is implementing is not handiling the exception(not catch block) it will terminate abnormally
 * If we handle it we dont need to again declare throws.  
 */

class Beta{
	void myMethod3() throws Exception{
		System.out.println("Application Started");
		System.out.println("Enter numarator :");
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		
		System.out.println("Enter denominator :");
		int val2 = scan.nextInt();
		
		System.out.println("Final value is: "+ val1/val2);
		System.out.println("Application terminated");
		scan.close();
		
	}
}

public class ExceptionLauncher2 {
	// Adding throws declaration for zBeta class method
	public static void main(String[] args) throws Exception  {

		System.out.println("Main method started");
		Alpha obj1 = new Alpha();
		try {
		//obj1.myMethod2();
		}
		catch(Exception e) {
			System.out.println("Exception caught at main method");
		}
		System.out.println("Main method terminated");
		
		// Since we are handling it here in case of exception we won't print "Application terminated message here
		Beta obj2 = new Beta();
		try {
		obj2.myMethod3();
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
		
		//Need to add throws
		obj2.myMethod3();
		
	}

}
