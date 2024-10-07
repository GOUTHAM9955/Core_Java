package com.launch.oops;
/*
 * JAVA is strongly typed object oriented programming language
 * 	Every object will has two features
 * 		object has and object does
 * 			object has are variables, object does are methods
 * 
 * Syntax to create object/instance of a class : new ClassName();
 * 
 * A class execution will always start from the class with main method whose name should be same as .java file name
 *  The java file will get compiles and a .class file will be created which is escuted by JVM inside JRE
 * 
 *  Internally for a java application to run an environment will be dedicated in RAM which is JRE.
 *  	>> Inside JRE JVM executes the JAVA program
 *  
 *  	Inside JVM we have data areas like
 *  		1) Method area
 *  		2) Runtime stack area
 *  		3) Heap area
 *  		4) Native stack area
 *  		5) Pc Register
 *   
 *   In stack area :
 *   	Local variables, method etc.. will happend in stack area
 *   In heap area :	
 *   	Instace, static variable, object creation takes place
 *   
 *   
 *  Instance variable vs Local variable:
 *  	Syntax is same the difference is based on where we declare them
 *  	When we declare variables for first time inside class we call it instance variable
 *  	When we declare a variable inside method of a class we call it local variable
 *  
 *  When we execute a program. Contoller in JVM will create a stack frame of main method in stack area.  
 *  	If we are creating an object of class the object will be created in heap area. If there are any instance variables memory will be allocated and
 *  		default value will be allocated if we didn't assign any. ex:code new className();
 *     	
 *  	A reference varible of the object will be created in stackarea and will be refering to the address of object in heap area.
 *  			ex: ClassName obj1 = new ClassName();
 *  
 *  	If we are calling any methods, the method will be loaded in stack area and local variables will be stoted in stack area.
 *  			ex: obj1.method1();
 *  
 *  	After activity of method is over memory stack frame will be deleted and memory of local variable will be deleted
 *  	
 *  	If there aren't any more lines in main method, control will go back to JVM and  stackframe main method will get deleted and reference variable
 *  		will also be gone
 *  	
 *  	Now, since we have a reference less object in heap memory, garbage collector which scans the heap area for reference less objects will identify it 
 *  		and delete it
 *  
 *  
 *  
 *  Key Notes:
 *  	Instance vaiables are directly declared in a class
 *  	Instance variable memory is allocatef inside heap area along with instance
 *  	Instance variable memory is de-allocated by garbage collector when object becomes reference less 
 *  	The scope of instance variable is, it can be used anywhere in the class
 *  	Default value for instance variable is intialised
 *  
 *  	Local variables are directly declared inside a method/block/loop
 *  	Memory is allocated in stack area
 *  	Memory is deallocated when stack frame of that method/Blocak is deallocated after executing it
 *  	The scope of local variableis limited to where it is declared
 *  	There is no default value for local variables
 *  	
 *   
 * 
 * 
 */

public class OOPSLauncher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
