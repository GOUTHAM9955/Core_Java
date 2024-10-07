package com.launch.oops;

// IN THIS CLASS WE ARE GOING TO LEARN ABOUT POLYMORPHISM AND ABSTRACTION
/*
 *  >> Creating parent type references for child objects is called upcasting
 * 	>> Upcastic is recommended implementation type
 * 
 * 	>> To access specialised methods when we have parent type refence we perform downcasting.
 * 			((ChildClass) patentRefernceType).specialisedMethod().
 * 
 * 	>> IF WE WANT TO ACHIEVE RUNTIME POLYMORPHISM WE USE PARENT CLASS REFERENCE TYPE TO CHILD CLASS OBJECTS.
 * 	>> METHOD OVERRIDING IS THE BASE OF POLYMORPHISM
 * 
 * 
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  // ABSTRACTION
 *  
 *  >> Abstraction in programming is a key concept in object-oriented programming (OOP) that focuses on hiding the complex implementation 
 *  	details of a system and exposing only the essential or necessary parts to the user. The primary purpose of abstraction is to reduce 
 *  	complexity and increase efficiency by separating “what” an object does from “how” it does it.
 *  >> We use abstract keyword for a method which don't have any body/implementation we just declare the methods.
 *  >> In a class even if one method is abstract we have to declare the class as abstract.
 *  >> Some other classes will extend the class in which these methods are presend and will have the implemention.
 *  >> We can have normal methods with body in abstract classes it is used when we want all the child classes to implement this method.
 *  >> We cannot create object/instance of abstract class but can create reference types to achieve polymorphism
 *  >> If any class is implementing an abstract class then it must and should have the implementaion of the abstract methods defined in it or else 
 *  	we have to define the child class also as abstract.
 *  >> Abstract class can have constructors which will be executed by super() method call present in child class 
 *  >> We canot make constrctor as abstract as there should be either super() or this() method call in constructor 
 *  >> we cannot have variable as abstract
 *  >> We cannot make abstract class as final since they don't participate in inheritance.
 *  >> We cannot make abstract methods as final since we cannot override them(they participate in inheritance) .
 *  >> Whenever we want to achieve 100% abstraction we have to go through interface and also a class can implement multiple interfaces
 *  
 *    
 */

// Example of abstract class

abstract class Aeroplane{
	public abstract void fly();
	public abstract void land();
}

class Cargoplane extends Aeroplane{

	@Override
	public void fly() {
		System.out.println("CargoPlane is flying");
		
	}

	@Override
	public void land() {
		System.out.println("Cargoplane is landing");
		
	}
	
}

public class PolymorphismAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
