package com.launcher.fundamentals;


// JAVA is strongly data typed.... we have to specify the type of the data the variable will be storing
// Data Types
/*
 * We have primitive data types java
 * 	1) Byte
 *  2) Short
 *  3) Int
 *  3) Long
 *  
 *  To manage decimal numbers we have 
 *  	1) float 2) double
 *  
 *  For character type we have
 *  	1) char - 2bytes "Must be in single quotes"
 *  
 *	For Bollean type we have
 *		1) boolean
 */

// WHOLE NUMBER
/*
 * We have 4 different data types for storing data types is for memory management
 * byte => 1 byte is allocated => 8 bits => range from  -128 till -127 {(-2)^n-1 till ((2)^n-1)-1}
 * short => 2 bytes is allocated => 16bits  
 * int => 4 bytes of memory
 * long => 8 bites of memory =? when we add long data type we have to add literal 'l' as suffix for explicit type casting ":  long num1 = 2443434l;
 * 
 * The default data type of any whole number in Java is INT
 * WHenever we perform calculation of any type the resultant is always of type integer. Even for divising the decimal is truncated.
 *  
 */

//DECIMAL NUMBERS
/*
 * float => 4 bytes --- We have to do explicit type casting float: num1 = 246.13
 * double => 8 bits
 * 
 * The default data type is double
 */

// CHARACTER DATA TYPE
/*
 *  According to ASCII >>  There are total of 128 commonly used charactes for whom we require 7 bits to manage => (2)^7+1 (Additional 1 bit as buffer) => 8bites = 1 byte
 *  C programme uses ASCII
 *  
 *  To add additional characters JAVA follows UTF / UNICODE format which used 2bytes or 16bits
 */

//BOOLEAN DATATYPE
/*
 * No fixed memory type for boolean, it varies from system to system
 * It can only store two values 'true' or 'false'
 */

// TYPE CASTING
/*
 * Implicit vs Explicit type casting
 * 
 * 1) Implicit type casting
 * 		=>  Typically occurs from a smaller or less precise type to a larger or more precise type (e.g., converting an int to a float or double)
 * 
 * 2) Explicit type casting 
 * 		=> Explicit type casting, or type conversion, is when the programmer manually specifies that a data type should be converted to another type using casting operators or conversion functions.
 * 			Typically occurs from a larger or more precise type to a smaller or less precise type
 * 			Ex: int a =20; double b= 30.0;  a = (int) b;
 */


//OPERATORS
/*
 * Uniary operator: We need one operand ex: i++
 * 	Pre increament: ++i  
 * 	Post Increament: i++
 * => The difference will come b/w post and pre increament when we assign the value
 * 		For post increamnt assignment will happen prior to increment : int a =5; int b = a++ => b=5, a =6
 * 		For pre increment it will increment 1st and assign it after that: int a =5; int b = ++a => b=6, a =6
 * 			Ex: a =5;
 * 				b = ++a + a++ + ++a + ++a + a++ + --a + --a + a--
 * 					6   +  6   + 8  +   9  +  9  +  9  +  8  +  8
 * 
 * Binary Operator: We need two operends: (10+2)
 */


// THINGS TO LEARN
/*
 * What format primitive data type uses
 */

public class fundamentalslauncher2 {

	public static void main(String[] args) {
		
	}

}
