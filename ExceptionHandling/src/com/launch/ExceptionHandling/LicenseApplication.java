package com.launch.ExceptionHandling;

import java.util.Scanner;


class UnderAgeException extends Exception {
	
	UnderAgeException(String msg) {
		super(msg);
	}
}

class OverAgeException extends Exception {
	
	OverAgeException(String msg) {
		super(msg);
	}
}
class Applicant{
	int age;
	
	public void input() {
		System.out.println("Please enter your age");
		Scanner scanner  =new Scanner((System.in));
		while(true) {
		try {
		age = scanner.nextInt();
		break;
		}
		catch(Exception e){
			System.out.println("Please enter a valid number");
			scanner.next();
		}
		}
	}
	
	public void validate() throws UnderAgeException, OverAgeException{
		if (age<18){
			UnderAgeException ageException1 =  new UnderAgeException("Under age exception");
			System.out.println(ageException1.getMessage());
			throw ageException1;
		}
		
		else if(age>60) {
			OverAgeException ageException2 =  new OverAgeException("Over age exception");
			System.out.println(ageException2.getMessage());
			throw ageException2;
			
		}
		
		else {
			System.out.println("You qualify for license application");
		}
	}
	
}

class License{
	void application(){
		Applicant app = new Applicant();
		try {
			app.input();
			app.validate();
		}
		
		catch (UnderAgeException | OverAgeException e){
			
			try {
				app.input();
				app.validate();
			}
			
			catch (UnderAgeException | OverAgeException e1){
				
				try {
					app.input();
					app.validate();
				}
				
				catch (UnderAgeException | OverAgeException e2){
					System.out.println("Your application is blocked");
					
				} 
			} 
		} 

	}
}


public class LicenseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		License obj1 = new License();
		obj1.application();

	}

}
