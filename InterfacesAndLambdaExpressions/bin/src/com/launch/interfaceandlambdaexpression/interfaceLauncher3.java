package com.launch.interfaceandlambdaexpression;

import java.util.Scanner;


interface Cal11{
	double add();
	double sub();
}

//An intereface without a body is called marker or tagged interface
//Ex: Serializable interface

// We cannot have a constructor in an interface as the class implementing it won't call it by super() method. It gives compile time error
interface Alpha{
	
}

interface Cal12 {
	//double add();
	//double sub();	
	double mult();
	double div();

}



class Demo {
	Demo(){
	System.out.println("Its a demo class");
}
	}




// A CLASS CAN EXTEND ANOTHER CLASS AND IMPLEMENT AN INTERFACE AT THE SAME TIME HOWEVER IT SHOULD 
//FIRST EXTEND THEN IMPLEMENT THE INTERFACE

class Cal13 extends Demo implements Cal11, Cal12{

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

public class interfaceLauncher3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

/*
* * * * * * * * Interface VS Abstract class* * * * * * * *

>>In an interface all the methods are by default abrstract and public but in abstract class we have 
specify it explicitly

>> In an interface all variables are by default public static final but in abstract class we have to 
specify it 

>> A CLASS CAN EXTEND ONLY ONE ABSTRACT CLASS BUT CAN IMPLEMENT ANY NUMBER OF INTERFACES AND ALSO
EXTEND ANOTHER CLASS 

*/