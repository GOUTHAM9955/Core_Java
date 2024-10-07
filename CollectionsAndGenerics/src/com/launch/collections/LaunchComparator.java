package com.launch.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
	int age;
	String name;
	double avg;
	
	Cricketer(int age, String name, double avg){
		this.age = age;
		this.name = name;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}
	
}

class Alpha123 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (((Cricketer)(o1)).avg > ((Cricketer)(o2)).avg) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

public class LaunchComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer cr1 = new Cricketer(35, "abc", 63.44);
		Cricketer cr2 = new Cricketer(45, "pqr", 85.54);
		Cricketer cr3 = new Cricketer(32, "neq", 77.64);
		
		ArrayList<Cricketer> list = new ArrayList<Cricketer>();
		list.add(cr1);
		list.add(cr2);
		list.add(cr3);
		
		Alpha123 a = new Alpha123();
		Collections.sort(list,a);
		System.out.println(list);
		
		// Simplified way of above implementation
			// Since we have a single abstract method we can use abstract class implementation		
		Comparator c1 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if (((Cricketer)(o1)).avg < ((Cricketer)(o2)).avg) {
					return 1;
				}
				else {
					return -1;
				
			}
			}
			
		};
		
		Collections.sort(list,c1);
		System.out.println("2) "+list);
		
		
		// More simplified implementation with lambda expression
		/*
		 * Comparator l = (Object o1, Object o2) -> { if (((Cricketer)(o1)).avg >
		 * ((Cricketer)(o2)).avg) { return 1; } else { return -1; }
		 * 
		 * }; Collections.sort(list,l);
		 */
		
		// The above code is same as
		
		
		Collections.sort(list,( o1, o2) -> //Type of data is optional
		{ 
			if (((Cricketer)(o1)).avg >((Cricketer)(o2)).avg) {
			    return 1; 
			} 
			else { 
				return -1; 
				}
		 });
		
		System.out.println(list);
	}
	
	

}
