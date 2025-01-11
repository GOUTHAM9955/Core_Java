package com.launch.multithreading;
// One More Example for Block Level Synchorization

class Car implements Runnable
{

	@Override
	public void run() 
	{
	//	System.out.println(Thread.currentThread().getPriority());
		try
		{
			System.out.println(Thread.currentThread().getName()+ " has entered parking lot");
			Thread.sleep(3000);
			synchronized(this)
			{
				System.out.println(Thread.currentThread().getName() + " got into car to drive");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " started the driving");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " came back and parked the car");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}

public class MultiThreadingLauncher7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		
		t1.setName("Rohan");
		t2.setName("Rohit");
		t3.setName("Roshni");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
