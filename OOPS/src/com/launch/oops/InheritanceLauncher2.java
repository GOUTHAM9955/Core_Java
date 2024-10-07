package com.launch.oops;

/*
 * Access Specifiers:
 * 					Within a class ||  Within a package outside class || Outside a packaged with is-a relationship || Outside package
 * 		Public 			True				True								True										True  
 * 		Protected		True	   ||       True					  ||        True                               ||   	False	
 * 		Default         True	   ||       True					  ||        False                              ||   	False	        
 * 		Private			True	   ||       False					  ||        False                               ||   	False	
 * 		
 * 		>> Default is the automatic access specifier of a class 
 * 		>> Public classes can be used throug out the class
 * 
 * Constructor execution in case of inheritance:
 * 		>> When ever we invoke parametarised or zero parametarised constructor by default zero parametarised constructor of parent class will get executed.
 * 		>> To invoke parametarizes constructor of patent class we can use super() method.
 * 		>> We can use this() method to call same class constructor based on the parametarised passed 
 * 		>> We cannot have this and super methods in the same class
 * 		>> super keyword will refer to parent class members (methods/ instance variables)
 * 
 * 
 * 
 * Rules to override inhherited method in child class
 * 	>> We cannot reduce the visibility in the child class but can be increased
 * 	>> No modifications should be made to the return type of the method unless it is covarient(where there is a(child -parent) relationship) return type
 *  >> While overriding if we pass differnet parameter list, that method in the child class will be considered as a specialised method
 *  >> Private members of a class will not get inherited
 *  >> Method Hiding: Static methods are inherited but cannot be overridden. They act's as specialised methods when we try to override. 
 *  		Ex: we can demostrate it by calling it with parent class object refernce type as it is acts as a specialised method we cannot call it
 *  	
 *  
 *  FINAL KEYWORD:
 *  	>> Final keyword can be applied to a class and final class in java doesn't participate in inheritance
 *  	>> Final keyword can be applied to methods and they will participate in inheritance but cannot be overriden
 *  	>> Final keyword can be applied to a variables and they will behave like constants and those values cannot be changed
 *  	>>  Static variables/methods can also be final 
 *  
 */

public class InheritanceLauncher2 {

	public static void main(String[] args) {
		
	}

}
