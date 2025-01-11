package com.launch.multithreading;

// Here lets discuss the second method of implementation of threads

/*
 * Instead of extending the treading class we can directly implement runnable interface
 */

class Running1 implements Runnable{
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

class Jumping1 implements Runnable{
	// In order to excute the thread the trasks must be defined in the classes itself with name run method or declare the method itself as run
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

class Crawling1 implements Runnable{
	// In order to excute the thread the trasks must be defined in the classes itself with name run method or declare the method itself as run
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




public class MultiThreadingLauncher3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Running1 run1 = new Running1();
		Jumping1 jump1 = new Jumping1();
		Crawling1 crawl1 = new Crawling1();
		
		// Since the above objects are not related to thread we have to create a thread for each object
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(jump1);
		Thread thread3 = new Thread(crawl1);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
