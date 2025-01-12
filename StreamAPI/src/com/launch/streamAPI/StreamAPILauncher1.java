package com.launch.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Function programming is introduced into JAVA with the help of stream API to process big data.
/*
 * We have 3 different operations in collection
 * 	1) Convert the collection in stream
 * 	2) Filter the values
 * 	3) Map the the filtered values(Change each filtered value based on an operation)
 * 	4) Generate a value from all the filtered and modified values
 * 
 * Filter and map are intermediate functions where we will execute it when ever it is required... i.e if it is called somewhere in the programme
 * Reduce is a terminal operator which is for sure executed
 */

public class StreamAPILauncher1 {

	public static void main(String[] args) {
		// Let us create an ArrayList and work on it
		
		List<Integer> ar =  Arrays.asList(5,3,6,2,8,1,9);
		
		// Converting List collection into Stream using stream method in collection
		Stream<Integer> stream1 = ar.stream(); 
		
		// To return size of stream
		long size = stream1.count();
		System.out.println("Size of stream :"+ size);
		
		// ONCE YOU PERFORM AN OPERATION ON A STREAM WE CANNOT REUSE IT 
		// So, when we try to perform any other operation on the above stream it will trown run time exception
		
		
		// ***********FILTER ODD VALUES IN STREAM *****************
		Stream<Integer> stream2 = ar.stream().filter(n -> n%2!=0); 
		System.out.println("List of odd values :"+ stream2.toList());
		// Behind the scenes
			// In filter we have pass a predicate(This is an interface) as input(See filter syntax)
		
			// Implementing predicate using annonymous inner class
			Predicate<Integer> predicate = new Predicate<Integer>() {
				@Override
				public boolean test(Integer n) {
					// TODO Auto-generated method stub
					return n%2 !=0;

			}
			
			};
			//This predicate is functional interface which has only one method and the outoput of lambda expression can be assigned to it instead of the above code
			Predicate<Integer> predicate1 = (n) -> n%2 != 0 ;
			Stream<Integer> stream4 = ar.stream();
			Stream<Integer> stream41 = ar.stream();
			Stream<Integer> stream5 = stream4.filter(predicate);
			Stream<Integer> stream6 = stream41.filter(predicate1);
			
			System.out.println("Filtered values using annonymous class is: "+ stream5.toList() + "\n" +"Filtered values using lambda expression is:" +stream6.toList());
			
			
		//************* TO DOUBLE THE VALUE ********************
			Stream<Integer> mapStream = ar.stream();
			
			// For map we have to pass the object of function (Using annonymous class)
			Function<Integer, Integer> function1 = new Function<Integer, Integer>() {

				@Override
				public Integer apply(Integer n) {
					// TODO Auto-generated method stub
					return n*2;
				}
				
			};
			
			//using lambda expression
			Function<Integer, Integer> function2 = n -> n*2;
			
			Stream<Integer> stream71 = ar.stream();
			Stream<Integer> stream72 = ar.stream();
			Stream<Integer> stream81 = stream71.filter(predicate).map(function1);
			Stream<Integer> stream82 = stream72.filter(predicate1).map(function2);
			System.out.println("Mapped values using annonymous class is: "+ stream81.toList() + "\n" +"Mapped values using lambda expression is:" +stream82.toList());
			// BEFORE JAVA 16 THERE IS NO toList() METHOD WE HAVE collect(Collectors.toList()) method
			
			
		//************* TO SUM THE MAPPED VALUES ********************
			// reduce method can be used to sum up the values which implements BinaryOperator which intern implements BiFunction interface
			
			// Implenting Bifunctional interface
			BinaryOperator<Integer> bf = new BinaryOperator<Integer>() {

				@Override
				public Integer apply(Integer carry, Integer element) {
					// TODO Auto-generated method stub
					return carry+element;
				}
				
			};
			Stream<Integer> stream91 = ar.stream();
			Stream<Integer> stream92 = stream91.filter(predicate).map(function1);
			// Identity is the fist value(Carry value) in the BinaryOperator
			int identity = 0;
			int finalResult = stream92.reduce(identity, bf);
			System.out.println("Final Sum is: " + finalResult);
			
			// Instead of all above code we can use lambda expression to write it as so
			
			int sum1 = ar.stream()
							.filter(n -> n%2 != 0)
							.map(n -> n*2)
							.reduce(0,(c,e) -> (c+e));
			System.out.println("Final sum using Lambda expression is :" +sum1);
			
			// USING OPTIONAL STRING
			
			// In case of methods sunch as findFirst where we can get null pointer exception which cannot be handled as they are checked exceptions we have to use optional strings
			
			List<String> names = List.of("GK","Harish","Peter","Raj");
			
			Optional<String> str1 = names.stream()	
										.filter(name -> name.startsWith("F"))
										.findFirst();
			String str2 = "Dummy";
			
			System.out.println(str1.orElse(str2));
			
			// Same without optional string and implementing orelse in findFirst method
			String str3= names.stream()	
					.filter(name -> name.startsWith("F"))
					.findFirst().orElse(str2);
			
			
			
			
			
			//************* For EACH ********************
			
			System.out.println("************* For EACH ********************");
				//For each implements consumer class
				/*
				 * Consumer<String> consumer = new Consumer<String>(){
				 * 
				 * @Override public void accept(String str) {
				 * System.out.println(str.toUpperCase());
				 * 
				 * }
				 * 
				 * };
				 * 
				 * names.forEach(consumer);
				 */
				// Consumer is a functional interface so we can implement lambda expression
				names.stream()
					.filter(name -> name.length()>2 )
					.forEach(name -> System.out.println( name.toUpperCase()));
				
			
	}

}
