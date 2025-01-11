package com.launch.multithreading;

/*
 * 
 * Threads implements runnable interface which is a Functional Interface with run method
 *  
 *  There are two ways to create threads in Java 
 *  	1) By extending the class to Thread
 * 
 */

class Running extends Thread{
	// In order to excute the thread the tasks must be defined in the classes itself with name run method or declare the method itself as run
	@Override
	public void run() {
		paceMethod();
	}
	public void paceMethod(){
	for(int i=0; i<10; i++) {
		System.out.println("System1 is Running on step"+ i);
	}
	}
}

class Jumping extends Thread{
	// In order to excute the thread the tasks must be defined in the classes itself with name run method or declare the method itself as run
	@Override
	public void run() {
		paceMethod();
	}
	public void paceMethod(){
	for(int i=0; i<10; i++) {
		System.out.println("System2 is Jumping on step"+ i);
	}
	}
}

class Crawling extends Thread{
	// In order to excute the thread the tasks must be defined in the classes itself with name run method or declare the method itself as run
	@Override
	public void run() {
		pacelMethod();
		}
	
	public void pacelMethod(){
	for(int i=0; i<10; i++) {
		System.out.println("System3 is Crawling on step"+ i);
	}
	}
}


public class MultiThreadingLauncher2 {

	public static void main(String[] args) {		
		// Now let us create instance of thread class 
		// Even though we are creating the instance the above classes as it is extending thread class it will create a seperate thread
		// When ever we define a new thread apart from main thread the activity that thread is supposed to perform must be defined on run method
		// In order to excute the thread the trasks must be defined in the classes itself with name run method or declare the method itself as run

		
		Running run = new Running();
		Jumping jump = new Jumping();
		Crawling crawl = new Crawling();
		
		// Now we have to handover the thread to the scheaduler to the JVM by using start() method
		run.start();
		jump.start();
		crawl.start();
		
		// The start method will call the undelying methods in run method.
		// BEHIND THE SCENES
		/*
		 * In the main thread in stack area 
		 * 		The main method will get executed and main thread will get executed and a stack frame for main method is created
		 * 		Now we create object of Running, Jumping and Crawling classes
		 * 		Which will create their own threads and stack frames
		 * 		Then we handover it to thread scheaduler by calling start method
		 * 		And for the above code we are not controliing which thread to execute first JVM will make sure to maximise the work done per CPU cycle
		 *
		 */
		
		
		
	}

}
