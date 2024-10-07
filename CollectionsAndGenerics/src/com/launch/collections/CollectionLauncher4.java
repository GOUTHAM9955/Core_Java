package com.launch.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

// ACCESSING THE DATA FROM COLLECTIONS
public class CollectionLauncher4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(50);
		ar.add(150);
		ar.add(25);
		ar.add(75);
		ar.add(125);
		ar.add(175);
		
		//To retrieve element at an index
		int i = (int) ar.get(2);
		//System.out.println(i);
		
		// To access all the elements using enhanced for loop but it is not recommended as
		// 		it behaves differently when we are doing concurrent modification
		for (Object obj:ar) {
			//System.out.println((int) obj);
			//ar.add(1);
		}
		
		// Best way to retrieve the data is by using iterator
		// "next" method in iterator will move to next position and retrieve the data
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			// Concurrent modification will thrown an exception, it will fail fast
			//ar.add(1);
		}
		
		//If you want to avoid these exceptions there are classes under util class called concurrent package
		//	which consists all these collection packages and those allow concurrent modification which starts with "CopyOnWrite"
		
		CopyOnWriteArrayList ar2 = new CopyOnWriteArrayList();
		ar2.add(100);
		ar2.add(50);
		ar2.add(150);
		ar2.add(25);
		ar2.add(75);
		ar2.add(125);
		ar2.add(175);
		Iterator itr2 = ar2.iterator();
		while(itr2.hasNext()) {
			//System.out.println(itr2.next());
			// Using classses form Concurrent modification(CopyOnWrite####) will not thrown an exception, it will fail safe
			ar2.add(1);
			itr2.next();
		}
		System.out.println("**********************");
		System.out.println(ar2);
		
		
		System.out.println("**********************");
		
		//we have LIST ITERATOR for list based classes which allow us to traverse in reverse direction
		// We have to pass the length of the array as parameter here to traverse from
		ListIterator ls1 = ar.listIterator(ar.size());
		while(ls1.hasPrevious()) {
			System.out.println(ls1.previous());
		}
		System.out.println("**********************");	
		ListIterator ls3 = ar.listIterator(ar.size()/2);
		while(ls3.hasPrevious()) {
			System.out.println(ls3.previous());
		}
		
	}

}
