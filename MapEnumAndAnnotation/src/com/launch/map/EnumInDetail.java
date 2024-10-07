package com.launch.map;


enum Result{
	// We define named constants in enums so they should be in all caps.
	// The name and value of these named constants is same. PASS is value and PASS is the name of it's named constant
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
		
		// to get all the values
		Result[] res = Result.values(); 
		
		Result.PASS.setMarks(60);
		int marks1 = Result.PASS.getMarks();
		
		int marks2 = Result.FAIL.getMarks(); // Will have default int value which is "0"
		System.out.println("PASS Marks: " + marks1 +", Fail marks : " + marks2);
		

	}

}
