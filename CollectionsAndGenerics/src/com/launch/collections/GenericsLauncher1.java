package com.launch.collections;
import java.util.*;

/*
 * Generics in java ensures type safety
 * Generics cannot be of primitive type
 * 
 * 
 */
class Alpha{	
	
	void buggyCode(){
		ArrayList al1 = new ArrayList();
		al1.add("This");
		al1.add("is GK");
		al1.add(1);
		
		String s11 = (String) al1.get(0); // We need to down cast it as the it is stored as an object
		String s12 = (String) al1.get(1);
		String s13 = (String) al1.get(2);// This line will thrown runtime error as while compiling it considers all the elements
										// as String type but throws error while running it
	}
	
	void genericsCode() {
		// It's not mandatory to mention data type on right side from JAVA 7
		// If we are specifying the genric type on both sides they should be same
		// We cannot pass primitive data types since they are not objects we have to use wrapper class
		
		ArrayList<String> list1 = new ArrayList<String>();	
		list1.add("This");
		list1.add("is GK");
		// list1.add(2); >> Throws error
		
		// While retrieving we don't need to downcast it
		String str1 = list1.get(0);
		}
	
}

public class GenericsLauncher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha obj1 = new Alpha();
		obj1.buggyCode();
		}

}
