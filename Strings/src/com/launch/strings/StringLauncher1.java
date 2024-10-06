package com.launch.strings;

/*
 * Data that is enclosed with in double quotes is treated as a string literal.
 * String class is used to manage immutable strings.
 * StringgBufffer and StringBuilder classes are used to manage mutable strings
 * String class is pressent in lang package in java. Anything present is lang package we don't need to import it and vice versa.
 * Inside String class they have overriden toString method. So when we try to print using the String varibale it gives it value the 
 * 		the reference address hold instead of the reference address that is stored in it.
 */

/*
 * We can create a string using the below three methods
 * 	1) String str1 = new String("abc");
 * 	2) String str2 = "abc"
 *  3) char ch[] = {'a','b','c'}
 *  	String str3 = new String(ch);
 */

/*
 * String memory is allocated in heap area after Java5 based on the method though which it is created
 * 		it can also be in a specific area called SCP(string constant pool) which is in heap area or in SCP and heap area.
 * 	
 * Always a copy will be stored in SCP but need not be refered by reference variable
 * Heap Area >> Duplicates Allowed
 * SCP >> Duplicates are not allowed
 * When we create string object with direct literal, memory is allocated in SCP and the variable will be refered to it
 * When we create with new keyword the memory will be allocated in heap area and a copy in SCP and the address of heap area will be
 * 		refered to the variable
 * Duplication(Same object with same value) is allowed in heap area but not in SCP.
 * Garbage collectors won't check the SCP area and the data will be erased when we shut down the JVM
 */

class StringReferrenceValues{
	
	// Different implementations
	{

		
		//str11 and str12 store the address value of heap object 
		String str11 = new String("ABC");
		String str12 = new String("ABC");
		
		//str21 and str22 stores the value in string constant pool
		String str21 = "ABC";
		String str22 = "ABC";
		
		System.out.print("With new keyword and same value 1 == value 2 : ");
		System.out.println(str11 == str12);
		System.out.print("With new keyword and same value 1 == value 2 : ");
		System.out.println(str21 == str22);
	
	
	/*
	 * When we use == -> references of the string are compared
	 *  When we use equals() method -> String value will be compared
	 *  equalsIgnoreCase() -> To compare string value ignoring cases
	 *  compareTo
	 */
	
	
		System.out.print("Result of using == operator on strings implemented with new keyword : ");
		System.out.println(str11 == str12);
		
		System.out.print("Result of using == operator on strings implemented without new keyword : ");
		System.out.println(str21 == str22);
		
		
		System.out.print("Result of using equals() method on strings implemented with new keyword : ");
		System.out.println(str11.equals(str22));
		
		System.out.print("Result of using equals() method on strings implemented without new keyword : ");
		System.out.println(str21.equals(str22));
		
	}
	
}






public class StringLauncher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReferrenceValues obj1 = new StringReferrenceValues();
	}

}
