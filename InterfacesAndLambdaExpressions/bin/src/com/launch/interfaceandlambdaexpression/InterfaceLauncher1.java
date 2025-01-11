package com.launch.interfaceandlambdaexpression;

/*
 >> Abstract classes can or cannot implement 100% abstraction since we can write 
 non-abstract(concrete methods) in it.
 
 >> To achieve 100% abstraction and loose coupling, we use interfaces.
 
 >> Sample example to understand Interface: initially when DB's want JAVA to get connected to their databases,
 Java gave then a architecture or implementation steps in the form of interface and gave it to DB's
 and DB's they wrote their own code using the interface (getConnection of reference type connection)
  to connect to DB's.
  
  >> Example2: If 3 different developers are working on a project to calculate SI. We give them the 
  interface to work on so that they will be using the same method names with different implementaions
  
***************** */

// In an interface by default the methods are public and abstract

// We cannot create an object of an Interface

// INTERFACE IS A COLLECTION OF PUBLIC ABSTRACT METHODS TO ACHIEVE 100% ABSTRACTION


interface Si{
	double formula();
	void result();
}

// If we want to establish the relation between an interface and a class we use implements keyword
// The class which is implementing the interface will also extend the interface 
// So the either we have to declare the class as abrstract class 
abstract class Si1 implements Si{
	//double formula();
	//void result();
}

// Or implement those methods

/* SINCE WE CANNOT CHANGE THE VISIBILITY OF SUPER CLASS METHODS WE HAVE TO DECLARE THE OVERIDDEN 
METHODS AS PUBLIC
*/
class Si2 implements Si{
	int value;
	@Override
	public double formula() {
		// TODO Auto-generated method stub	
		int p = 100;
		double t = 2.5;
		double r = 6.6;
		return (p*t*r)/100;
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("Simple interest is " + formula());
	}
	
	//We can have spl methods even in addition to abstract classes
	void endnote(){
		System.out.println("Thanks for checking with us");
	}
	
}

//************************

class Si3 implements Si{
	int value;
	@Override
	public double formula() {
		// TODO Auto-generated method stub	
		int p = 1000;
		double t = 2.5;
		double r = 6.6;
		return (p*t*r)/100;
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("Simple interest is "  + formula());
	}
	
}

public class InterfaceLauncher1 {
	
	public static void main(String[] args) {
		
// WE CAN CREATE INTERFACE TYPE REFERENCE FOR IMPLEMENTING CLASS OBJECT/INSTANCE TO ACHEIVE POLYMORPHISM	
//AND LOOSE COUPLING	
		Si si2 = new Si2();
		Si si3 = new Si3();
		si2.result();
		si3.result();
// To call specialized methods using interface reference we have to do downcasting
		((Si2) si2).endnote();
		
	}

}



