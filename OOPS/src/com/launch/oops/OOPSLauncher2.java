package com.launch.oops;

/*
 *  When a method don't give back any data after executing we specify it as void 
 * 
 * Parameter list which we pass in method are local variables and no default values will be assigned in methods stackframe
 * 		If we define a parameter list the arguments must be passed while calling it.
 * 		If it is returning anything it's up to us to collect those values
 * 
 * After return statement we force contoller to get out of the method so, we won't write anything after return statement
 * 
 * FYI: JVM is coaded in C
 * 
 * 	Method Overloading/ Compiletime polymorphism/ false polymorphism: 
 * 		Having methods with same name but different parameters in same class is called method overloading.
 * 		Java compiler will resolve it in compile time based on no:of parameters, data type of parameters and order of parameters.
 * 		
 *       The return type alone is not sufficient for method overloading. If two methods have the same name and the same parameter list,
 * 		    but different return types, the compiler will throw an error. This is because the return type is not considered part of
 * 		    the method’s signature for overloading purposes, and the compiler wouldn’t be able to differentiate between the methods
 * 		    based on the return type alone.
 * 		When we pass arguments implicit type casting can takes place
 * 			ex: double paramets list, we can pass integer arguments
 * 
 * 		In case if we two methods with same name have parameters list as (int, int)  (int, double):
 * 			and pass the arguments as (int, int): it will choose 1st method 
 * 
 * 		In case if we two methods with same name have parameters list as (double, int)  (int, double):
 * 			and pass the arguments as (int, int), compiler will check if have parameter list as (int, int) since there isn't any, it will look for
 * 			methods which can hold there int values and since both the methods have that capacity we will get compile time error
 * 
 * 		We can have multiple main methods and can overload it with different parameters but JVM will invoke only the main method 
 * 			which have (String[] args) as parameters
 * 		
 * 
 * Encapsulation: 
 * 	Process of giving control access to data member of a calss is called encapsulation
 * 		Encapsulation is acheived by 3 different components
 * 			1) Private keyword
 * 			2) Setter method
 * 			3) Getter method
 * 
 * 	When ever there is a name conflict b/w instance variable and setter i.e both insatance variable and setter have same name it is called showding problem and even though
 * 			you pass the parameter to setter the compiler won't assign it to instance variable. 
 * 		This probelm will be  solved by this keyword
 * 
 * 	this KEYWORD HOLDS THE ADRESS OF CURRENTLY RUNNING INSTANCE and used to set currently running objects data. It is used to differenciate local and instance variable and to	
 * 		assign data to instance variable from local
 * 
 * 
 * ********************************
 *  CONSTRUCTOR:
 *  	Constructor is a specilised setter whose name is same as that of class and not having any return type and will be invoke while object creation
 *  	Where ever we don't define an explicit constructor, Java compiler will include a default constructor having super() method call in it.
 *  	If we specify any constructor Java will not include any default constructor.
 *  	Constructor overloading is possible.
 *  	
 * 		Irrespective of the parametarised or non-parameteraised constructor, there will be a super() method call happening one 1st line of  the code
 * 			 which is used to invoke parent class constructor.
 * 		The only case where there won't be a super method call is if there is a this() method call which is also must be the 1st line of the code 
 * 			Based on the arguments provided in the this() method, it will invoke respenctive constructors
 * 	
 * 			
 * 	Terinary Operator:- 
 * 		Terinary operator is a replacement of if - else clause
 * 			boolean bol = (num1>num2)? true:false // >> bol=false
 * 
 * for complex operation lets say
 * 					if (num1>num2) {
			if(num1>num3) {
				res = num1;
			}
			else {
				res =num2;
			}
		}
		
		else if(num2>num3){
			res = num2;
		}
		else {
			res = num3;
		}
 * 		
 * 
 * 	Terenary operation goes as follows 
 * 			res = (num1>num2) ? (num1>num3 ? num1:num3) : (num2 > num3? num2:num3);
 * 
 * 
 * *****************************************
 * 
 * Wrapper Class:
 * 		 The purpose of wrapper classes is to allow primitive data types to be used as objects, which is useful in situations where objects are required, such as in collections.
 * 		
 * 
 * BOXING UNBOXING:
 * 		Boxing>> Converting primitive data type into it's wrapper class is called boxing
 * 		
 * 		Autoboxing >> Automatically converting primitive data type into it's wrapper class is called auto-boxing
 * 
 * 		Unboxing >> Converting wraper class back into corresponding primitive data type
 * 		Autounboxing>> Automatically converting wraper class back into corresponding primitive data type
 * 
 * 
 * 
 * *************************************
 * 
 * Static Keyword:
 * 		
 * 		We can have variables, Block of code or Methods as static
 * 			
 * 			Let have a breif overlook on JVM
 * 				When ever we have a java file >>>>> We compile it into bite code which is .class file>>> we handover it to JVM 
 * 					JVM will execute this inside JRE which is in RAM 
 * 					
 * 					JVM will make use of different components, 3 of the important components are
 * 						1) Class loader subsystem: Where code will be loaded into JVM environment
 * 							Loading : Like Bootstrap Loader, Execution calss loader, Application Loader
 * 							  Entire code is loaded into JVM ecosystem, 1st it will load rt.jar  which is a runtime library used in Java that contains all the core class libraries needed for running Java 
 * 							  Next code which we written will get loaded
 * 							Linking : verification,preparation and resolution
 * 								In this stage verification such as if all the bite code is proper format and for an instance proper reference is refered or not.
 * 								IN LINKING PHASE OF JVM CAME ACROSS ANY STATIC VARIABLE, ON HEAP AREA MEMORY WILL BE ALLOCATED
 * 							
 * 							Initialization 
 * 								IN INTIALIZATION IF THERE IS ANY STATIC BLOCK IT GETS EXECUTED
 * 								STATIC METHODS GETS LOADED INTO MEMORY
 * 						2) Runtime data areas: JVM will make use of different areas to perform the execution like object in heap area and method call in heap area etc..
 * 							In runtime, entire code is kept in Method area
 * 							If there is a method call, stack frames will be created in stack area
 * 							When we create an instance memory will be allocated in heap area
 * 							In PC Register, address of every executed will be stored
 * 							Native method stack: If any of the code is coded in anyother language like dependencies/libraries, it will be loaded here. To execute those Java will use JNI: Java native interface
 * 						3) Using the excution engine the code will get executed by coverting it into 0's and 1's
 * 							Interpriter: To convert code inot 0's and 1's. In compiler entire code is compiled at once, but in interpreter line by line code is converted into byte code
 * 							Just Intime Compiler: If there is any ferequent calls, to make the work of interpreter easy it will execute all the code in one go and The compiled code is stored in memory so 
 * 								that it can be reused without recompilation in subsequent executions, leading to faster performance over time.
 * 							Garbage collector: Will detele all reference less objects 
 * 
 * 		Static variable and methods of a class are object independent since they are not created at runtime 
 * 		We can call static methods with class name or by object reference name
 * 		Instance ariables cannot be used in static block or static methods as memory will be created when we create an object
 * 		If anything is executed before main method then it should be static block of main method class
 * 
 * 		Instance variable will get memory when we create instance of the class in the heap area inside the instance. But static varibles will be common to class instead of objects, it will have single 
 * 		memory location for all the objects.
 * 
 * 		Java intialization block will get executed during object creating before executing the constructor
 * 		Intialization block can be used to intialise the instance 
 * 
 *
 * 			
 * 
 */

class MyWrapper{
	int a = 100;
		// The below syntax is depricated
	//Integer a1 =new Integer(100);
	// Instead we use
		Integer a1 =Integer.valueOf(100);
		
	int n1 =31;
	// Autoboxing
	Integer n2 = n1;
	//Boxing
	Integer n22 = Integer.valueOf(n1);
	
	Integer n3 = Integer.valueOf(84);
	//Auto-Unboxing
	int n4 = n3;
	
	//Unboxing
	int n5 = n3.intValue();
	
	
}

class StaticDemo{
	static int a,b;
	
	static {
		System.out.println("I didn't execute it explicitly");
		a=10;b=20;
	}
	
	static void disp() {
		System.out.println("a, b:" +a +", "+ b);
	}
	
}

class StaticUsage{
	int id;
	String Name;
	// Accessed by all objects 
	static int count;
	
	// When we create an object
	{
		count++;
	}
	StaticUsage(int id, String Name){
		this.id = id;
		this.Name = Name;
	}
}


public class OOPSLauncher2 {

	public static void main(String[] args) {
		//StaticDemo.disp();
		StaticUsage obj1 = new StaticUsage (1,"GK");
		StaticUsage obj2 = new StaticUsage (2,"RK");
		System.out.println("No:of students registered:"+StaticUsage.count);
	}

}
