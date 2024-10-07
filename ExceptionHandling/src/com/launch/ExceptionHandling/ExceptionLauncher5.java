package com.launch.ExceptionHandling;
//Finally vs return vs exit

/*
 * Finally dominates throw keyword
 * Finally will dominate return statement
 * System.exit() {to shoutdown JVM} dominates finally keyword.
 */

class Dominance{
	int FinallyVsReturn() {
		try {
			System.out.println("This is to check Finally's dominance over return statement");
			return 0;
		}
		
		finally {
			System.out.println("If this statement executes: Finally dominates return keyword");
		}
	}
	
	void ExitvsFinally(){
		try{
			System.out.println("This is to check Exit method dominance over Finally statement");
			System.out.println("Exiting JVM, did you get the message form Final block???");
			System.exit(0);
		}
		finally {
			System.out.println("If this statement executes: Finally dominates exit method");
		}
	}
}

public class ExceptionLauncher5 {

	public static void main(String[] args) {

		Dominance obj1 = new Dominance();
		System.out.println(obj1.FinallyVsReturn());	
		obj1.ExitvsFinally();
	}


}
