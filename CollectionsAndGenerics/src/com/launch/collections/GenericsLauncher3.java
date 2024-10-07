package com.launch.collections;

import java.util.ArrayList;

// Implementing upper and lower bounds  ingenerics

class HomoSep{
	
}

class Human extends HomoSep{
	
}

class Cats{
	
}

public class GenericsLauncher3 {

	public static void main(String[] args) {
				
		ArrayList<HomoSep> hs1 = new ArrayList<HomoSep>();
		ArrayList<Cats> cat1 = new ArrayList<Cats>();
		ArrayList<Human> hr1 = new ArrayList<Human>();
		ArrayList<Object> obj1 = new ArrayList<Object>();


		/*
		 *  Compile time errors
		 *  hs1 = hr1;		
		 *  hs1 = obj1;		
		 *  hs1 = cat1;
		*/
		
		// We can solve the above problem by upper(extends) and lower(super) bounds in generics with the help of wild card.
		
		// Upper Bound
		ArrayList<? extends HomoSep> hs2 = new ArrayList<>();
		ArrayList<Cats> cat2 = new ArrayList<Cats>();
		ArrayList<Human> hr2 = new ArrayList<Human>();
		ArrayList<Object> obj2 = new ArrayList<Object>();
		
		
		hs2 = hr2;
		
		hr2 = (ArrayList<Human>) hs2;
		/*
		 *  Compile time errors
		 *  hs2 = obj2;		
		 *  hs2 = cat2;
		*/		
		 
			// Lower Bound
			ArrayList<? super HomoSep> hs3 = new ArrayList<>();
			ArrayList<Cats> cat3 = new ArrayList<Cats>();
			ArrayList<Human> hr3 = new ArrayList<Human>();
			ArrayList<Object> obj3 = new ArrayList<Object>();
			
				
			hs3 = obj3;	
			

			
			/*
			 * Compile time errors
			 * hs3 = cat3;
			 * hs3 = hr3;
			 */
			 
	}
	

	

}
