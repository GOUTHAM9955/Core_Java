package com.launch.ExceptionHandling;

import java.util.Scanner;

/*
 * Exceptions that occures at run time which leeds to abnormal termination of application at runtime are handeled by exception handling
 * The errors which are not generated from compiler are called unchecked exception
 * We surround the risky code in try block and to handle the exception we write catch block
 * "Exception" class is the partent class of all the exceptions 
 * 
 */


// BEHIND THE SCENES
/*
 * In case of an exception the stack frame of that pirticular object will create an exception object and hand it over to JVM
 * JVM checks if the handler is present in the stackframe, if there is then JVM will hand the exception object to the handler (catch block)
 * Or esle it will go to default exception handler or else it will go to operating system for handling it if OS is also not able to handle it then
 * 	 the syystem will crash
 * 
 * THE LINES AFTER WHICH THE EXCEPTION OCUURED WILL NOT GET EXECUTED SINCE EXCEPTION HANDLER COMES NEXT 
 */

//WHAT DOES EXCEPTION OBJECT CONTAIN
/*
 * Name of the exception : EX: ARTHEMATIC EXCEPTION
 *  Description of the exception: EX: / BY ZERO
 *  Statck trace of the exception
 * 
 */

class Division{
	void myMethod() {
		try {
			System.out.println("Enter numarator :");
			Scanner scan = new Scanner(System.in);
			int val1 = scan.nextInt();
			
			System.out.println("Enter denominator :");
			int val2 = scan.nextInt();
			
			System.out.println("Final value is: "+ val1/val2);
		}
		
		catch(Exception e){
			System.out.println("Enter a valid number");
		}
	}
}
/*
 We can write multiple chatch blocks to return specific exceptions but it is recommended to write a generic exception at end to catch 
		unanticipated exceptions and that must and should be at end. Catch blocks should follow hirarchy.. ie parent Exception class should 
		be declared after child classes
 We cannot have only try block block without finally or catch block 
 We cannot have multiple try and single catch
 We cannot have single catch and multiple catch with same exception
 The order shold be try -> catch-> finally 
 
 */


class MultipleExceptions{
	void mutiPurpose() {
		

			System.out.println("Enter numarator :");
			Scanner scan = new Scanner(System.in);
			int val1 = scan.nextInt();
			System.out.println("Enter denominator :");
			int val2 = scan.nextInt();
			try {
			System.out.println("Final value is: "+ val1/val2);
			}
			
			catch(ArithmeticException e) {
				System.out.println("Enter valid denominator");
			}
			System.out.println("There is an array with length 5, enter the position number at to retrieve its value");
			int arr[] = {5,2,3,1,4};
 			int pos = scan.nextInt();
 			try {
			System.out.println("The value at position:" +pos + " is :" +arr[pos]);
 			}		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter position value within range (0,4)");
		}
		
		catch(Exception e) {
			System.out.println("Enter position value within range (0,4)");
		}
	}
}



public class ExceptionLauncher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Division obj1 = new Division();
		//obj1.myMethod();
		
		MultipleExceptions obj2 = new MultipleExceptions();
		obj2.mutiPurpose();

	}

}
