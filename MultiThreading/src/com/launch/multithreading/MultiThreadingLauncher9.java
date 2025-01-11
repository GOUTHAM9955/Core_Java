package com.launch.multithreading;

// If two threaads which are in block state are dependent on each other for resources(cyclic dependency) then we call it as dead lock.


// A livelock is a situation in concurrent programming where two or more processes continuously change their state in response to each other 
	  //	without making any progress. It’s similar to deadlock in that the processes are stuck, but differs in that they are actively trying to 
			//complete their tasks, whereas in a deadlock, they are waiting for resources indefinitely.

// Sample Implementation of thread

			/*class Library implements Runnable{
				String book1 = "Java";
				String book2 = "Spring";
				String book3 = "Machine Learning";
				public void run(){
					if(Thread.currentThread().getName()== "Student1")
					{
						synchronized(book1) {
							System.out.println("Student1 is reading Java");
							try {
								Thread.sleep(4000);
							}
							catch(Exception e){
								
							}
							synchronized(book2) {
								System.out.println("Student1 is reading Spring");
								try {
									Thread.sleep(3000);
								}
								catch(Exception e){
									
								}
								synchronized(book3) {
									System.out.println("Student1 is reading ML");
									try {
										Thread.sleep(2000);
									}
									catch(Exception e){
										
									}
								}
								}
							}
						
									
							
							
						}
					
					else {
						synchronized(book1) {
							System.out.println("Student2 is reading Java");
							try {
								Thread.sleep(4000);
							}
							catch(Exception e){
								
							}
							synchronized(book2) {
								System.out.println("Student2 is reading Spring");
								try {
									Thread.sleep(3000);
								}
								catch(Exception e){
									
								}
								synchronized(book3) {
									System.out.println("Student2 is reading ML");
									try {
										Thread.sleep(2000);
									}
									catch(Exception e){
										
									}
								}
								}
							}
					}
					}
				}*/

//EXAMPLE OF DEAD LOCK SCENERIO

class Library implements Runnable{
String book1 = "Java";
String book2 = "Spring";
String book3 = "Machine Learning";
public void run(){
	if(Thread.currentThread().getName()== "Student1")
	{
		synchronized(book1) {
			System.out.println("Student1 is reading Java");
			try {
				Thread.sleep(4000);
			}
			catch(Exception e){
				
			}
			synchronized(book2) {
				System.out.println("Student1 is reading Spring");
				try {
					Thread.sleep(3000);
				}
				catch(Exception e){
					
				}
				synchronized(book3) {
					System.out.println("Student1 is reading ML");
					try {
						Thread.sleep(2000);
					}
					catch(Exception e){
						
					}
				}
				}
			}
		
					
			
			
		}
	
	else {
		synchronized(book3) {
			System.out.println("Student2 is reading ML");
			try {
				Thread.sleep(4000);
			}
			catch(Exception e){
				
			}
			synchronized(book2) {
				System.out.println("Student2 is reading Spring");
				try {
					Thread.sleep(3000);
				}
				catch(Exception e){
					
				}
				synchronized(book1) {
					System.out.println("Student2 is reading Spring");
					try {
						Thread.sleep(2000);
					}
					catch(Exception e){
						
					}
				}
				}
			}
	}
	}
}

public class MultiThreadingLauncher9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		Thread thread1 = new Thread(lib);
		Thread thread2 = new Thread(lib);
		
		thread1.setName("Student1");
		thread2.setName("Student2");
		
		thread1.start();
		thread2.start();
		
	}

}
