package com.launch.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.TreeSet;

//ArrayDequeue

/*
 * Array Dequeue implements dequeue interface which is inturn is under queue interface
 * It is double ended queue
 * We can insert data at starting or ending of ArrayDequeue
 * Index based actions cannot be performed on ArrayDequeue
 * We cannot add objects with null data as it will lead to NullPointerException
 */

class ArrayDequeueImplementation{
	void alpha() {
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		
		ad.addFirst(0);
		ad.addLast(40);
		
		System.out.println(ad);
	}
}

//PRIORITY QUEUE
/*
 * The order of insertion is not followed in priority queue
 * Minimum heap data structure is followed in priority queue( BOTTOM THERE IS EXPLANATION FOR MIN HEAP IMPLEMENTATION)
 * 		It follows tree implementation with left and right nodes
 * 		Each element will be inserted from left to right and parent element should be given 
 * 			higher priiority(should be the least value when compared to all child nodes) by swapping
 * 		When priting the result each node of the level will be printed from top to bottom
 * 	Null values are not allowed in priority queue
 */

class PriorityQueueImplementation{
	void alpha() {
		PriorityQueue pq  = new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);		
		pq.add(75);
		pq.add(125);
		pq.add(175);
		pq.add(null);
		System.out.println(pq);
	}
}

//TREE SET
/*
 * Tree set implements Sorted set which implements Navigable set which implements sets
 * Treeset follows red black algorithm(Binary Search Algorithm)
 * 		Binary tree need not be balanced
 * 		The first element will be inserted at parent node
 * 		If the next element is less than that node it will be inserted to its left or to its right
 * 
 * The data will be retrieved from in order traversal(Left Value Right)
 * 
 * All the set based classes duplication is not allowed. It won't throw an exception but wont store the data
 * Null values are not allowed
 * 
 */

class TreeSetImplementation{
	void alpha() {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		//ceiling return the same object if the object is present in the set or else higher value
		System.out.println(ts.ceiling(75)); //100
		//Higher will only return the next higher value even if the value is present in the set
		System.out.println(ts.higher(75)); //100
		
		//Opposite functionalities to ceiling or higer methods
		System.out.println(ts.floor(75));
		System.out.println(ts.lower(75));
		
		System.out.println(ts.tailSet(75)); //75 is inclusive
		System.out.println(ts.headSet(75)); //75 is exclusive
		
		System.out.println(ts);
	}
}

public class CollectionLauncher2 {
 public static void main(String[] args) {
	 //ArrayDequeueImplementation obj1 = new ArrayDequeueImplementation();
	 //obj1.alpha();
	 //PriorityQueueImplementation obj2 = new PriorityQueueImplementation();
	 //obj2.alpha();
}
}


/*
 * step-by-step implementation of a Min Heap using the given data 100, 50, 150, 25, 75, 125, 175
 *Step-by-Step Min Heap Insertion with Graphs
1. Insert 100
Heap: [100]
Graph:
Copy code
  100
2. Insert 50
Heap: [100, 50]
Percolate up: Swap 50 with 100.
Resulting Heap: [50, 100]
Graph:
markdown
Copy code
    50
   /
 100
3. Insert 150
Heap: [50, 100, 150]
No need to percolate up as 150 is larger than its parent (50).
Graph:
markdown
Copy code
    50
   /  \
 100  150
4. Insert 25
Heap: [50, 100, 150, 25]
Percolate up: Swap 25 with 100, then swap 25 with 50.
Resulting Heap: [25, 50, 150, 100]
Graph:
markdown
Copy code
      25
     /  \
    50  150
   /
 100
5. Insert 75
Heap: [25, 50, 150, 100, 75]
No need to percolate up as 75 is larger than its parent (50).
Graph:
markdown
Copy code
      25
     /  \
    50  150
   / \
 100 75
6. Insert 125
Heap: [25, 50, 150, 100, 75, 125]
Percolate up: Swap 125 with 150.
Resulting Heap: [25, 50, 125, 100, 75, 150]
Graph:
markdown
Copy code
      25
     /  \
    50  125
   / \   /
 100 75 150
7. Insert 175
Heap: [25, 50, 125, 100, 75, 150, 175]
No need to percolate up as 175 is larger than its parent (125).
Graph:
markdown
Copy code
      25
     /  \
    50  125
   / \   / \
 100 75 150 175
Final Min Heap
The final min heap after inserting all elements is:

markdown
Copy code
        25
       /  \
      50   125
     / \   / \
    100 75 150 175 
 * 
*/