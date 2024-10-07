package com.launch.map;
// CREATING CUSTOM ANNOTATON

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* To create own annotation we have to use interfacekeyword. Annotation works based on the mechanism of interfaces, adding @ at starting,
 	will let the compiler know that it is not interface but an annotation type is getting created
 	
 	>> When we create a annotation we have to mention the restriction, either it is restricted to developer, compiler or runtime level
 		and also the target like if is used on mehod or local variable or instance variable etc..
 	
 	
 	*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // we can declare multiple targets >> @Target({ElementType.TYPE, ElementType.METHOD, ...})
						// We are using ENUMS to define RetuntionPolicy and ElementType(ex: RUNTIME , SOURCE, TYPE, METHOD)
@interface CricketPlayer{
	// We can pass values to annotations by declaring the attributes
	// We use below syntax to define the attribute
	String country() default "India"; // If we specify default value we may or may not declare the value while initializing it
	int age() default 35;
}


@CricketPlayer(age = 36)
class ViratKohli{
	int innings;
	public void setInniings(int innings) {
		// TODO Auto-generated method stub
		this.innings = innings;
		
	}
	
	
}

public class LaunchAnnotaion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViratKohli vk = new ViratKohli();
		vk.setInniings(500);
		
		//To get the value of an annotation we use reflect api
		
		//All the info in vk will be collected in a class using getClass method.
		Class<? extends ViratKohli> c = vk.getClass();
		
		//To get annotation information in Annotation which is parent of all annotations
		Annotation an =  c.getAnnotation(CricketPlayer.class);
		
		//Of all the annotations I want CricketPlayer annotations so I am downcasting it
		CricketPlayer cp = (CricketPlayer) an;
		
		System.out.println("Info in annotation-> age :" +cp.age()+" ,country :"+cp.country());
	}

}
