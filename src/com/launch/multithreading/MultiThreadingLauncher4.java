package com.launch.multithreading;

// IMPLEMENTING A SINGLE RUN METHOD FOR MULTIPLE TASKS

class Running2 implements Runnable{
	// In order to excute the thread the trasks must be defined in the classes itself with name run method or declare the method itself as run
	@Override
	public void run() {
		String tName =  Thread.currentThread().getName();
		if (tName == "run") {
			this.runMethod();
		}
		else if (tName == "jump") {
			jumpMethod();
		}
		else {
			crawlMethod();
		}
	}
	
	public void runMethod(){
	for(int i=0; i<10; i++) {
		System.out.println("System1 is Running on step"+ i);
	}
	}


	public void jumpMethod(){
	for(int i=0; i<10; i++) {
		System.out.println("System2 is Jumping on step"+ i);
	}
	}
	
	public void crawlMethod(){
	for(int i=0; i<10; i++) {
		System.out.println("System3 is Crawling on step"+ i);
	}
	}
}



public class MultiThreadingLauncher4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Running2 run = new Running2();
		
		Thread thread1 = new Thread(run);
		Thread thread2 = new Thread(run);
		Thread thread3 = new Thread(run);
		
		thread1.setName("run");
		thread2.setName("jump");
		thread3.setName("crawl");
		
		thread1.start();
		thread2.start();
		
		
		/* If you want main thread to wait until all the above threads finish executing we use join method on those threads
		thread1.join();
		thread2.join();
		thread3.join();
		*/
		
		//Similarly if you want main thread to execute thread3 only after executing thread1 and thread2 we can write as so
		thread1.join();// main thread waits until thread1 finishes 
		thread2.join();// main thread waits until thread2 finishes 
		
		thread3.start();// Main thread starts thread3
		thread3.join();
	}

}
