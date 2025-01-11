package com.launch.interfaceandlambdaexpression;
//THERE ARE TWO WAYS TO IMPLEMENT AN INTERFACE WITHOUT USING implements KEYWORD
// 1) Annonymous inner class
// 2) Lambda expression


interface Alpha1{
	void welcome();
}



public class InterfaceLauncher5 {

	public static void main(String[] args) {
		// IMPLEMENTING INTERFACE USING ANNNOYMNOUS INNER CLASS 
		// THIS WORKS ONLY INCASE OF INTERFACES
		Alpha1 alpha = new Alpha1(){
			@Override
			public void welcome() {
				System.out.println("Welcome to annonymous class");
			}
			
		};
		
		alpha.welcome();
	}

}
