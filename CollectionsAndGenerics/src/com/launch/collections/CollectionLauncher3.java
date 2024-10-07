package com.launch.collections;

import java.util.*;

//Hash Set
/*
 * Hash set directly implements set interface
 * Hash Set follows hashing algorithm
 * Hash set is quick in inserting and retrieving the data
 * 		if 75% of the hash table is occupied the data will be doubled
 * 
 * NULL VALUES  ARE ALLOWED IN HASH SET
 */


class HashSetImplementation{
	void alpha() {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		
		//Null  values are allowed 
		hs.add(null);
		
		System.out.println(hs);
	}
}


//Linked Hashet follows hashing algorithm but follows order of insertion
// It extends hashset class
class LinkedHashSetImplementation{
	void alpha() {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		
		//Null  values are allowed 
		hs.add(null);
		
		System.out.println(hs);
	}
}

public class CollectionLauncher3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetImplementation obj1 = new HashSetImplementation();
		obj1.alpha();
	}

}
