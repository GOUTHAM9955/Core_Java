package com.launch.strings;

// Commonly used string methods
class StingPredefinedMethods{
	void StingMethods(){
		String str = "GouthamChowdaryKakani";
		// To modify it into upper case
		//To modify it into lower case 
		//To get length of a string
		//To get the char at index 5
		//To get 1st index of character a
		//To get last index of char a
		//To check if it ends with string ani
		//To check it it begins with string Gou
		// To find the substring between two indexes
		//To store it into array of characters
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.endsWith("ani"));
		System.out.println(str.startsWith("G"));
		System.out.println(str.substring(4,12));
		char chaArr[]= str.toCharArray();
		for(char ch:chaArr) {
			System.out.print(ch + ", ");
		}
		
	}
}

// String Concatination
/*
 * For string concatination we have two method
 * 		1) using "+" operator b/w two string fields
 * 		2) using predefined concat() method -> str1.concat(str2)
 * 
 * Any datatype we concatinate with a string will become string 
 * EXAMPLE: 
 * 	1) "100" + 4 + 10 => "100410"
 *  2) 100 + 4 + "10" => "10410"
 *  
 *  When we use two string variables created with out using new keyword by using leterals(It will be refered to String constant pool), 
 *  concat it using "+" symbol and assign it to a new String feild then the memory will be in allocated in SCP  
 *  If we use concat() method then the memory will be allocated in heap area because when we use reference variable to perform any action
 *  	the memory will be allocated in heap area( ex: s1.concat(" abc"))
 *  
 *  Same applies to concatinating using "+"
 *  	>> If reference varable is used to concat it will be in heap area
 *  	>> If literals are used to concat it will be in scp area
 *   
 *   When we concat string literals using "+" symbol the concatination happens during compilation and the value is stored in SCP or else
 *   at runtime the strings will be converted to stringBuffe and concatinated and converted back to Stings and object is created 
 *   and will be stored in heap area and we can use intern() to store that value in SCP.
 */  

class StringConcatination{
	void strConc() {
		String str1 = "ABC";
		String str2 = "PQR";
		
		String str3 = "ABCPQR";
		
		String strSCP = "ABC"+"PQR";
		
		String strHeap2 = str1 + str2; // This stores the value in heap by creating an object
		
		String strHeap = str1.concat(str2);
		
		System.out.println(str3 == strSCP);
		System.out.println(str3.equals(strHeap));		
		System.out.println(str3!=strHeap);
		
		//Proof
		if(str3 == strSCP && str3.equals(strHeap) && str3!=strHeap) {
			System.out.println("Using + to concat stored the value in SCP and concat() method stored the value in Heap area");
		}
		else{
			System.out.println("My statement is false");
		}
	}
	
}

public class StringLauncher3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StingPredefinedMethods obj1 = new StingPredefinedMethods();
		//obj1.StingMethods();
		
		StringConcatination obj2 = new StringConcatination();
		obj2.strConc();
	}

}
