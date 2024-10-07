package com.launch.ExceptionHandling;

import java.util.Scanner;

//EXCEPTION HEIRARCY
/*
 *  Object is parent of all classes
 *  All the keywords that ends with "able" -> Runnable, Serializable are interfaces except Throwable which is a class in Java
 *  Errors and Exception are subclass of Throwable
 *  
 *  Errors are caused due to lack of system resources and are not recoverable
 *  When ever there us an error the programme terminates abnormally ex: OutOfMemoryError,StackOverflowError
 *  Errors are classified as unchecked type
 *  
 *  
 *  
 *  Exception have two types ->> 1) Checked  2)Unchecked
 *  Exceptions are caused due to code which are recoverable and handled by try catch blocks
 *  
 *  Checked exceptions are checked and warned by compiler ex: InterruptedException in case of threads 
 *  	We can handle this by throws or try catch blocks
 *  
 *  Unchecked exceptions exceptions caused due to code and are anticipated by developer, compiler wont check for those.
 *  All thhe unchecked exceptions comes under RuntimeExceptions which is a child of Exception class
 *  
 *  
 *  Partially checked exceptions:
 *  	Exceptions whose child classes have both checked as well as unchecked exception classes: 
 *  	Ex: Eception class(RuntimeException : Checked , IOException:Unchecked)
 *  
 */

/*
 * 											Object
 * 												|
 * 												↓
 * 											Throwable
 * 												↓	
 * 		---------------------------------------------------------------------
 * 		↓																	↓
 *    Error(Unchecked)     												Exception (partically checked)
 *    										-------------------------------------------
 *    										↓                     ↓ 			↓          	↓..........
 *  							RuntimeException(Uncheck)     IOException(Checked)   SQLException(Checked)
 * 
 */

// CHECKED vs UNCHECKED Exceptions
/*Exception which will be anticipated by compiler like in case of Thread.sleep(), the compiler will force us to handle Inturrupted exception, these
 * are called checked exceptions. These exception wont occure at compile time but at runtime but compiler will throw an error by warning us that it 
 * 	occure at runtime and should be handled
 * 
 * Apart from Throwable all the classes which ends with ..able are Interfaces like: Runnable, Serializable, Customisable etc..
 * 
 * 
 * 
*/

//METHOD OVERRRIDG USING EXCEPTION HANDLING
/*
 *  If a method in patent class doesn't thrown any  exception, in the child class if we are overriding a method
 *  	we can throw  unchecked exception but not checked exception.
 *  
 *  
 *  If we are throwing an unchecked exception in parent class we can or cannot thrown an unchecked exception 
 *  	in child class method while overriding it but we cannot throw checked exception.
 *  
 *  If we are throwing an checked exception in parent class we can thrown the same checked exception in child class
 *  	or dosen't throw an exception at all or throw unchecked exception while overriding but cannot through partially checked exception.
 *  
 *  
 *  
 */

//CUSTOM EXCEPTIONS
/*
 * We can check for exception with the help of if else clauses too but the need for try catch is that if in case of
 * 	ATM pin entry if you enter the pin wrongly 3 times then we have to block the user until then he can try 3 times,
 * 	This used case can be handled by exception handling that too with custom exception
 */

//Custom exceotion class.... this must extend exception class or runtime exception

// syntax to add multiple exceptions in single catch block => catch(exception1 | exception2 e){ .... }

class InValidCredentialsException extends Exception{
	public InValidCredentialsException(String msg) {
		super(msg);
	}
}

class Atm{
	String username  = "GK";
	String password = "9595";
	String entered_username;
	String entered_password; 
	void input() {
		System.out.println("Enter your username");
		Scanner scanner = new Scanner(System.in);
		entered_username =  scanner.nextLine();
		System.out.println("Enter your password");
		entered_password = scanner.nextLine();
	}
	
	void validate() throws InValidCredentialsException{
		if(username.equals(entered_username) && password.equals(entered_password)) {
			System.out.println("Credentials matched");
		}
		else {
			InValidCredentialsException ivce =  new InValidCredentialsException("Invalid Credentials");
			System.out.println(ivce.getMessage());
			throw ivce;
		}
	}
}

class Bank{
	void initiate()  {
		Atm obj1 = new Atm();
		try {
		obj1.input();
		obj1.validate();
		}
		catch(InValidCredentialsException e){
			System.out.println("Try Again!!!");
			try {
				obj1.input();
				obj1.validate();
			} catch (InValidCredentialsException e1) {
				// TODO Auto-generated catch block
				System.out.println("Try Again!!!");

				try {				
					obj1.input();
					obj1.validate();
				} catch (InValidCredentialsException e2) {
					System.out.println("You entered invalid credentials thrice: Access revoked");
					//throw new InValidCredentialsException();
				}
			}

		}
	}
}

public class ExceptionLauncher6 {

	public static void main(String[] args) throws InValidCredentialsException {
		// TODO Auto-generated method stub
		Bank obj1 = new Bank();
		obj1.initiate();
	}

}
