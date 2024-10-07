package com.launch.map;

import java.util.HashMap;

import com.launch.map.*;

/*
 * Map is a interface which has 3 major classes
 * 		1) HashTable
 * 		2) HashMap
 * 		3) LinkedHashMap
 * 
 * 	Map is not part of collection heirarchy 
 * 
 * Map follows hashing algorithm
 * It will store the data in the form of ket value pair
 * The value of key can be a value or an object
 * The key or value can be null
 * We cannot have repeated key but can have duplicate values with different keys
 * 
 * (key, value) pair is of entry type which is a sub interface of map interface
 */

class Alpha{
	String gender;
	int age;
	public Alpha(String name, int id) {
		super();
		this.gender = name;
		this.age = id;
	}
	@Override
	public String toString() {
		return "Alpha [gender=" + gender + ", age=" + age + "]";
	}
	
}

class HashmapImp{
	HashMap hm1 = new HashMap();
	void implementation() {
		
		hm1.put(1, "GK");
		hm1.put("a", 9491);
		hm1.put((new Alpha("male", 27)), "Details");
		hm1.put(1,"KG");// Replaces previous values
		hm1.put(null, null);
		System.out.println(hm1);
	}
	
	
}

/*
 *  Linked Hash Map is same as HashMap but order of insertion is maintained
 * In HashTable value and key cannot be null 
 * In tree map value can be null but not key 
 */



public class MapLauncher1 {
	public static void main(String args[]) {
		HashmapImp obj1 =new HashmapImp();
		obj1.implementation();
	}

}
