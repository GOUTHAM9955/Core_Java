package com.launch.strings;
//STRINGBUFFER and STRINGBUILDER

/*
 * String's intialized or decalred with string buffer or string builder are mutable
 * We can only create these objects using new key keyword
 * We have append methods to these objects instead of concat
 * The primary difference between string builder and string buffer is in string buffer is synchronized  
 * 		but not in string builder  which is asynchronised and multithreading is possible here
 */

class MutableStrings{
	
	void strBuffer() {
		StringBuffer sb1 = new StringBuffer("Goutham");
		sb1.append(" Kakani");
		System.out.println(sb1);
		//Unlike concat where we have to pass String object we can append data of any type in append
		System.out.println(sb1.append(9595));
	}
	
	void strBuilder() {
		StringBuilder sb2 = new StringBuilder("Kakani");
		sb2.append(" Goutham");
		System.out.println(sb2);
	}
}

class StrCapacity{
	//Initial capacity of string builder or buffer is 16
		//If we don't add anything to the constractor add append the data the next increament will will be ((current size)*2 + 2)
	void calcCapacity(){
		StringBuilder sb3 = new StringBuilder();
		//If we add the data directly in constructor it will be 16+ number of characters
		// StringBuilder sb5 = new StringBuilder("abc"); 19 in this case
		System.out.println("Initial string buffer capacity is :" +sb3.capacity());
		sb3.append("This is a big sentence for practice purpose");
		System.out.println("Once the capacity exceeds the initial threshold it becomes :" +sb3.capacity()
				+ " which is (oldcapacity*2 + 2)");
		
		//trimToSize() method helps to delete the extra space and confine the string size to the actual capacity it needed
		
		
		
	}
}

class ComparingSB{
	void comparator() {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1 == sb2);// False since the reference objects are different
		System.out.println(sb1.equals(sb2));// Flase since the equals method in inherited from object class unlike in 
												//Strings where it compared the reference objects which gives the adresses
		
	}
}

public class StringLauncher4 {

	public static void main(String[] args) {
		StrCapacity obj1 = new StrCapacity();
		obj1.calcCapacity();
	}

}
