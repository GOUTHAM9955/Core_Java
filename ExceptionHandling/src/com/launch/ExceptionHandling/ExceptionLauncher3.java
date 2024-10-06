package com.launch.ExceptionHandling;

//Rethrowing an exception
/* 
 *
 * Some times after handling the exception we have to throw the exception forcefully to the method through which we are invoking
 * We throw the handled exception object to caller of that method.
 * Since we handle exception in catch block we have to do it inside catch block
 * 
 * We use "throw" keyword to that. And since we do that weather we handle the exception or not it's recommended to declare that
 * 	the class throws exception using "throws" keyword
 * 
 * When ever you use throw keyword, statements below that wont be executed even it is outside the catch block of that main method
 * 	In order to run the lines below throws we must and should use finally keyword. 
 * The code under finally block will get executed irrespective of the execption ie. in case of no exception, 
 * 	if there is exception and is handled and also in case it the exception is not handled.
 * 
 * The finally block should be associated directly with a try block, and an intervening statement 
 * 	between try and finally is not allowed. It's not mandatory to have catch block b/w 
 * 
 * 
 */

/*
 * try: to maintain risky code 
 * catch : to maintain handling code
 * finally: to maintain clean up code/ resource deallocation
 * throw: to handover the exception object to JVM manually
 * throws: to delegate the responsibility of handling the exception to the caller
 */



import java.util.Scanner;

class Beta1{
	void myMethod4() throws Exception{
		System.out.println("Application Started");
		
		System.out.println("myMethod4 started");
		System.out.println("Enter numarator :");
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		
		System.out.println("Enter denominator :");
		int val2 = scan.nextInt();
		try {
		System.out.println("Final value is: "+ val1/val2);
		System.out.println("myMethod closed");
		scan.close();
		}
		catch(Exception e) {
			System.out.println("Exception occured at Bata1 myMethod4");
			throw e;
		}
		// When we are rethrowing an exception we must and should specify the following blocks which we want to execute in finally block as throw acts
			// as return statement and it will stop executing the line there affter even if we had catch block
		//If we dont use finally this block of code won't get executed
		finally {
		System.out.println("Application terminated");
		}
		
	}
}


public class ExceptionLauncher3 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
		Beta1 obj1 = new Beta1();
		obj1.myMethod4();
		}
		
		catch(Exception e){
			System.out.println("Exception occured in main method");
		}
		System.out.println("Main method terminated");
	}

}
