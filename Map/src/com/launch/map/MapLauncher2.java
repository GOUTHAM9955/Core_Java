package com.launch.map;

import java.util.*;
import java.util.Map.Entry;






public class MapLauncher2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "Java");
		hm1.put(2,  "Python");
		hm1.put(3, "ML");
		
		// To get value of a key
		String val1 = hm1.get(1);
		System.out.println("Value of key 1 is: " +val1);
		
		//To collect values and print it
		System.out.println("To collect values and print it");
		
		// Since the values in Map are sored as an entry which is an inner interface of collections we use collection to store the values
		// and iterator to print those values
		Collection<String> values= hm1.values();
		Iterator<String> itr = values.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// To retrieve keys
		Set<Integer> keys = hm1.keySet();
		
		Iterator<Integer> itr2 = keys.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// To get set of key and values
		
		Set<Entry<Integer, String>> entry = hm1.entrySet();
		
		Iterator<Entry<Integer, String>> itr3 = entry.iterator();
		while(itr3.hasNext())
		{
			
			Map.Entry<Integer, String> pair = itr3.next();
			System.out.println(pair.getKey()+ " : " + pair.getValue());
		}
		

		
	}

}
