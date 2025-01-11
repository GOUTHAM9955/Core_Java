package com.launch.multithreading;

// We declare the method as sychronized to make the method as thread safe(Multiple threads cannot access a single method at a time)
// All the methods in StringBuffer are synchronized i.e it is thread safe where as StringBuilder is not thread safe


class Bathroom implements Runnable
{
	@Override
	synchronized public void run() 
	{
		try
		{
			
			System.out.println(Thread.currentThread().getName()+ " has entered the bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+ " is using the bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+ " has exited the bathroom");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class MultiThreadingLauncher5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Bathroom b=new Bathroom();
	       
	       Thread t1=new Thread(b);
	       Thread t2=new Thread(b);
	       Thread t3=new Thread(b);
	       
	       t1.setName("BOY");
	       t2.setName("GIRL");
	       t3.setName("TIKTOKER");
	       
	       t1.start();
	       t2.start();
	       t3.start();

	}

}
