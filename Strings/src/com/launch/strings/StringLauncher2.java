package com.launch.strings;

/*
 * If a string object is created the variable will store the address of the object
 * And if assign a new value to that string a new object will be create in heap area and that address will be refered in the field value
 * 		and the 1st object will stay as it is.
 */


class ImmutabilityofString{
	{
		String str = "ABC"; // String object is created with value ABC and the address is stored in "str"
		str = "PQR"; // The address that "str" value is referring to will change to the new object with value "PQR" and "ABC" object remains
						// as it is and garbage collector deletes before closing JVM
	}
	
}

// How CompareTo method works
//compareTo ->  character by character value is compared (return 0 if all the charecter values matches(ASCII values) or the 
//		  	 differences in Auskey values of 1ST MISMATCH character)
class ComparingStrings{
	void compareToImple() {
		String abc = "abc";
		String abd = "abd";
		System.out.println("Implemeting compareTo method on 'abc' and 'abd' string :" + abc.compareTo(abd));
		
		
		String zbc = "zbc";
		System.out.println("Implemeting compareTo method on 'abc' and 'zbc' string :" + abc.compareTo(zbc));

		System.out.println("Implemeting compareTo method on 'zbc' and 'abc' string :" + zbc.compareTo(abc));
		
		System.out.println("Implemeting compareTo method on 'zbc' and 'abd' string :" + zbc.compareTo(abd));
		
	}
}

public class StringLauncher2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparingStrings comp = new ComparingStrings();
		comp.compareToImple();

	}

}
