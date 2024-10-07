package com.launch.collections;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Class		        Internal     | null data   | for-each loop  |  iterator   | listIterator  |    Index based Insertion
 * 				                     |        	   |				|			  |				  | 	and accessing
 * 
 * ----------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------
 * ArrayList     |Dynamic arrays    |    ✓        |      ✓        |      ✓        |      ✓         |       ✓ 
 *               |                  |            |                |               |                |
 * LinkledList   |Doubly Linked list|    ✓        |      ✓        |      ✓        |       ✓        |      ✓ 
 *               |                  |           |                 |               |                |
 * ArrayDequeue  |Double ended queue|           |        ✓        |      ✓        |                |
 *               |                  |           |                 |               |                |
 *  PriorityQueue|     min Heap     |           |       ✓         |      ✓        |                |
 *               |                  |           |                 |               |                |
 * TreeSet       |Binary search|    |           |       ✓         |      ✓        |                |
 *               |                  |           |                 |               |                |
 * 
 * HashSet      |     Hashing      |      ✓      |      ✓        |       ✓        |                |
 *              |                  |             |                |                |                |
 * 
 * LinkedHashSet|                  |     ✓       |      ✓        |       ✓        |                |
 *              |Hashing       |                 |               |                |
 */


//VECTOR
/*
 * Vector was introduced before collections and added into collection framework later
 * Vector class implements list interface
 */
class VectorImplementation{
	void alpha() {
		Vector vec = new Vector();
		vec.add(100);
		vec.add(50);
		vec.add(150);
		vec.add(44);
		System.out.println(vec);
		//Enumerator is introduced before collections and works same as iterator
		//Vector has both iterator and enumarator methods
		
		Enumeration en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}

//AUTOBOXING
/*
 * Wrapper classes are used to treat the primitive data types as objects to make it more object oriented
 * Ex: 
 * 	int - > Integer
 *  char -> Integer
 *  double -> Double
 *  boolean -> Boolean
 */

class WrapperIntroduction{
    void alpha(){
    	// It is not recommeded to use constructor to create an object using wrapper class 
    	Integer i = new Integer(10);
    	// We can use valueOf method Instead
    	Integer i2 = Integer.valueOf(20);
    	Integer j1 = Integer.valueOf(i2);// This is called Boxing
    	int j = 100;
    	Integer j2 = j1; // This is auto-boxing(Automatically converting primitive type to object)
    	
    	// We have the concepts of Unboxing and Auto Unboxing
    	int k1 = j2.intValue(); // Unboxing
    	int k2 = j2; // Auto-unboxing
    	}
    
}

public class CollectionLauncher5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
