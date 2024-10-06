package com.launch.interfaceandlambdaexpression;

// FROM JAVA 8 WE CAN HAVE METHODS WITH IMPLEMENTATION USING DEFAULT KEYWORD

//WE CAN ALSO HAVE STATIC METHOD IN INTERFACES FROM JAVA8 BUT IT WON"T GET INHERITED IN IMPLEMTING CLASS AND STATIC METHOD MUST NOT BE ABSTRACT AND
	// SHOULD HAVE BODY

//WE CAN ALSO HAVE PRIVATE METHODS IN INTERFACES FROM JAVA9 SO THAT IF DEFAULT METHODS HAVE 
//COMMON IMPLEMENTION CAN BE DONE HERE

interface Exp1{
	default void upgrade1() {
	}
	static void upgrade2() {
		System.out.println("WoW we have one more upgrade with backend compatability");
	}
}

//It is not mandatory to override the default method but if we want to
// override it should be of public type
class Pract implements Exp1{
	
	public void upgrade1() {
		System.out.println("WoW we have an upgrade with backend compatability");
	}
	

	
}


public class InterfaceLauncher4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp1 exp = new Pract();
		exp.upgrade1();
		
	}

}
