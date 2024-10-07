package com.launch.collections;

/*
 * Comparable is implemented in the target class using compareTo method
 * We need not modify target class while usinf comparator which inturn implemts compare method 
 */

import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable{
	int age;
	String name;
	double avg;
	
	Cricketer1(int age, String name, double avg){
		this.age = age;
		this.name = name;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.avg < ((Cricketer1)(o)).avg) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

public class LLaunchComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer1 cr1 = new Cricketer1(35, "abc", 63.44);
		Cricketer1 cr2 = new Cricketer1(45, "pqr", 85.54);
		Cricketer1 cr3 = new Cricketer1(32, "neq", 77.64);
		
		ArrayList<Cricketer1> list = new ArrayList<Cricketer1>();
		list.add(cr1);
		list.add(cr2);
		list.add(cr3);
		Collections.sort(list);
		
		System.out.println(list);
	}

}
