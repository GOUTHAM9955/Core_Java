package com.launch.oops;

/*
 *  >> Inheritance is used to relate two classes by making a class aquire the properties of another class with the help of extents keyword 
 *  
 *  >> Inheritance provides code reusability and promotes is a relationship
 *  
 *  >> The class aquiring the properties is called child/sub-class and the class that is getting implemented is called super class.
 *  
 *  >> A class can have multiple child classes and a child class can inherit only one super class 
 *  
 *  >> private members of a class will not get inherited
 *  
 *  >> Multilevel inheritance is possible but not multiple inheritance and this is called dimond shaped problem
 *  
 *  >> We cannot have cyclic inheritance which is patent and child cannot inherit eachother
 *  
 *  >> Parent of all the classes is object class
 *  
 *  >> Constructor will never get inherited but will be called by super method call present in child class constructor
 *  
 *  Types of methods
 * 	    >> Inherited methods are method which we get from parent and used without modification
 *  	>> Overriden methods are method which we get from parent and modify in child class
 *  	>> Specialized methods are methods which are defined in child class
 *  
 *  WHILE CREATING A NEW CHILD OBJECT, THE REFERENCE VARIABLE CAN BE OF PARENT TYPE
 *  	>> Using parent class s reference type, we can invoke inherited and overriden methods directly, this is called upcasting 
 *  	>> But we have to downcast before invoking specialised methods >> syntax:  ((ChildClass) ParentTypeReference).specialisedMethod().
 */
public class InheritanceLauncher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
