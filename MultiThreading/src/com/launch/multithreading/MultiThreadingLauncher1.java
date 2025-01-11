package com.launch.multithreading;
import java.lang.*;

// Multithreading is concurrent execution not parallel execution in reality only 1 thread excutes with effective cpu utilization
/* Multitasking is done at OS level or in application level

   Multitasking at application level will be hapenning with the help of threads
   If we don't define any thread by default main thread is responsible for running the application
   To manage thread we have pre defined class called thread
 */

/*
 * There are 4 main states in a thread
 * 	1) New : When we create a thread
 *  2) Runnable: When we give live to thread
 *  3) Running: When it gets chance to execute
 *  		3.1) Wait: when it encounters wait() method. It will come out of wait state when it encounters notify() or notifyAll() method 
 *  			and goes back to RUNNABLE state.
 *  		3.2) Blocked: When the required resource is unavailable in synchronized environment. 
 *  				It will come out when of blocked state when the resource is available and goes back to RUNNABLE state
 *  		3.3) Sleep: When it encounters sleep() method. It will comeout when the sleep time is over and goes back to RUNNABLE state
 *  4) Dead: Once the thread execution is done it will got to dead state.
 *  
 *  Multiple threads can be in new and runnable state but only single thread can be in running state.
 */


public class MultiThreadingLauncher1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Application started");
		

		Thread thread = new Thread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		Thread.sleep(2000);
		
		thread.setName("GK's 1st thread");
		thread.setPriority(8);
		System.out.println(thread.getName() +", with preiority "+ thread.getPriority());
		
		
		System.out.println("Application ended");
	}

}
