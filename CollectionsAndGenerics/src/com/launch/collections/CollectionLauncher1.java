package com.launch.collections;

import java.util.*;

/*
 * The Collections Framework in Java is a set of interfaces and classes that provide a standard way to 
 * 	handle a group of objects. It includes various implementations such as lists, sets, and maps that help 
 * 	in storing and manipulating large amounts of data efficiently.
 * 
 * We have ArrayList, LinkedList, ArrayDeque, PriorityQueue, TreeSet, HashSet, LinkedHashset
 * All of the above 7 frameworks are present in utility package
 */

//ArrayList
/*
 * It implements List interface
 * It follows dynamic array datastructure
 * Order of insertion is maintained
 * Inserting an element at starting of the ArrayList is more costly
 */


//COLLECTON HEIRACHY
/*
 * java.lang.Iterable
       |
       +-- java.util.Collection
                |
                +-- java.util.List
                |       |
                |       +-- java.util.ArrayList
                |       +-- java.util.LinkedList
                |       +-- java.util.Vector
                |               |
                |               +-- java.util.Stack
                |
                +-- java.util.Queue
                |       |
                |       +-- java.util.PriorityQueue
                |       +-- java.util.LinkedList (also implements Queue)
                |
                +-- java.util.Deque
                |       |
                |       +-- java.util.LinkedList (also implements Deque)
                |       +-- java.util.ArrayDeque
                |
                +-- java.util.Set
                        |
                        +-- java.util.HashSet
                        |       |
                        |       +-- java.util.LinkedHashSet
                        |
                        +-- SortedSet----> NavigableSet--->java.util.TreeSet
                        +-- java.util.EnumSet

 * 
 */

class ArrayListImplementation{
	void Alpha() {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		al1.add("Goutham");
		al1.add("Kakani");
		al1.add(9595);
		///To add at specific index 
		al1.add(0, "Details");
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add(1);
		
		//Null values can be added
		al2.add(null);
		
		//To append an array list to another array list
		al1.addAll(2 , al2);
		System.out.println(al1);

		
		
		
		// We have do down casting because all the elements are stored as objects in collections
		int val1 =  (int) al1.get(2);
		System.out.println(val1);
		System.out.println(al1.indexOf(9595));
		
		
	}
}
//LinkedList
/*
 * Linked list uses doubely linked list data structure
 * It implemets LIST and DEQUEUE interface
 * 
 * When ever you add a data a node is created in memory which stores the value along with address of adjacent nodes
 * Adding the value at any index wont shift the data just the linking happens so, it much efficient compared to ArrayList
 * 
 * 
 */

class LinkedListImplementation{
	void Alpha() {
		LinkedList l1 = new LinkedList();
		l1.add(100);
		l1.add(2);
		l1.add(3);
		l1.addFirst(0);
		l1.addLast(4);
		
		//Offer method(method of dequeue) might or might not get added into the collection which works same as add method
		//Add method for sure adds the data to the collection
		l1.offer(1);
		l1.offerFirst('>');
		l1.offerLast('.');
		
		//Peek method(of dequeue) will give the FIRST element of the collection.
		//Poll method also gives 1st element of collection and will remove that the collection.
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		
		//Push method to add element at STARTING
		//Pop to retrieve the FIRST element and remove it from the collection
		System.out.println("*******");
		System.out.println(l1);
		l1.push('.');
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);
		l1.add(null);
		System.out.println(l1);
		
		
	}
}
		
public class CollectionLauncher1 {

	public static void main(String[] args) {
		LinkedListImplementation obj1 = new LinkedListImplementation();
		//ArrayListImplementation obj2 = new ArrayListImplementation();
		obj1.Alpha();
	}

}
