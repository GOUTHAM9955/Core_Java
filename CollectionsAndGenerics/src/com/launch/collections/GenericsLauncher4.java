package com.launch.collections;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;

public class GenericsLauncher4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(40);
		list.add(20);
		list.add(30);
		
		// There is a utility class called collections where we have predefined methods to make use of to work on collection
		Collections.sort(list);
		System.err.println(list);
	}

}
