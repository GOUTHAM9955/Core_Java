package com.launch.interfaceandlambdaexpression;

/*
 >> Lambda expressions are introduced in Java8 which can be using "->" expression
 >> lambda expressions are unnamed methods
 >> left side of the arrow is used for passing parameter and right side for method body
 >> lambda expression is dependent on functional interface (Interfaces with single abstract methods). It can have default or static methods
 >> We use @FunctionalInterface annotation to declare the interface as functional interface and compiler will through an error if we try
 to add an more than one abstract method.
 */

/*
 * In the below example we had a functional interface with signle abstract method, we implemented it with the help of lambda expression 
 */


@FunctionalInterface
interface FI{
	void show();
}

@FunctionalInterface
// With single parameters
interface FI1{
	void disp(int a);
}

@FunctionalInterface
//With return type
interface FI2{
	int getLength(String str);
}

@FunctionalInterface
//With multiple parameters
interface FI3{
	int add(int a, int b);
}



public class LambdaLauncher1 {

	public static void main(String[] args) {
		// 0 parameterized
		FI exp = () -> System.out.println("My first lambda impementation");
		exp.show();
		
//******With single parameter********//
		//1)
		FI1 f1 = (int a) -> System.out.println("Integer " +a);	
		f1.disp(10);
		
		//2) We dont need to specift data type or parameters for single parameter
		FI1 f2 = a -> System.out.println("Integer " +a);	
		f2.disp(100);
//******With return type********//
		// In case of abstract methods with return type if we include return keyword we must and should include curley braces
		FI2 f3 = str -> {
			return str.length();
			};
		System.out.println("Length of my name is "+f3.getLength("Goutham"));
		
		//In case of abstract methods with return type there is no mandatory requirement to include return keyword
		FI2 f4 = str -> str.length();
		System.out.println("Length of my last name is "+f4.getLength("Kakani"));
		
//******With more than one parameter********//
		// Paranthesis is compulsory for parameters since there are multiple parameters but data type is optional
		FI3 f5 = (a,b)->a+b;
		System.out.println("sum is "+ f5.add(10, 20));
	}

}
