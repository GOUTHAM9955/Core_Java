package com.launch.multithreading;
//We can restrict the synchronization to block level, method or  class level.

class Resource implements Runnable
{

	@Override
	 public void run() 
	{

		try
		{
			for(int i=65; i<71;i++)
			{
				System.out.println((char)i);
				Thread.sleep(3000);
			}
			// We used synchronized on this key word as from here only currently running object will go ahead and remining threads will wait
			synchronized(this)
			{
				for(int i=65; i<71;i++)
				{
					System.out.println((char)i);
					Thread.sleep(3000);
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

public class MultiThreadingLauncher6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new Resource();
		Thread t1=new Thread(res);
		Thread t2=new Thread(res);
		t1.start();
		t2.start();

	}

}
