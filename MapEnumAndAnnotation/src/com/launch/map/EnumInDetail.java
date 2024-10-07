package com.launch.map;


enum Result{
	PASS, FAIL, NR;
	//Everytime when we create an enum a class is getting created in background, in this case 3 classes are created
	// public static final Result PASS = new Result(); 
	//public static final Result FAIL = new Result(); 
	//public static final Result NR = new Result(); 
	
	// We can declare variables in enums
	int marks;
	
	// We can have constructors
	private Result() {
		System.out.println("Result enum constructor");
	}
	

	// It can have it's own methods
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
}

public class EnumInDetail {

	public static void main(String[] args) {
		Result.PASS.setMarks(60);
		int marks1 = Result.PASS.getMarks();
		
		int marks2 = Result.FAIL.getMarks(); // Will have default int value which is "0"
		System.out.println("PASS Marks: " + marks1 +", Fail marks : " + marks2);
		

	}

}
