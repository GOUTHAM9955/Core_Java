package com.launch.interfaceandlambdaexpression;

interface Calculator{
	// We can declare variables inside interface which are public static final
	double pi = 3.14; // public static final 
	double add();
	double sub();
}

// An interface cannot implement another interface since the methods in the implemented
//interface cannot have implemetation in implementing interface

// It's compulsory for the implementing class to override all the methods in an interface or else the implementing class must be declared as abstract

//An interface can extend another interface but not from other class
interface Cal1 extends Calculator{
	//double add();
	//double sub();	
	double mult();

}

interface CalDiv{
	double div();
}

//A CLASS CAN IMPLEMENT MULTIPLE INTERFACES

class Cal2 implements Cal1, CalDiv{

	public double add() {
		return 10+3;
	}
	public double sub() {
		return 10-3;
	}

	public double mult() {
		return 10*3;
	}

	public double div() {
		return 10/3;
	}
	
}




public class InterfaceLauncher2 {

	public static void main(String[] args) {
		

	}

}
