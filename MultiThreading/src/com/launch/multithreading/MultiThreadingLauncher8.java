package com.launch.multithreading;
/*
 *  Main thread starts the excution but usually it also finishes 1st in excution to prevent this we use joins
 */
import java.util.Scanner;

class Alpha1 extends Thread
{
	@Override
	public void run()
	{
		banking();
	}
	public void banking()
	{
		System.out.println("Banking Activity Started...");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account number");
		int ac=scan.nextInt();
		System.out.println("Enter the password");
		int pw=scan.nextInt();
		System.out.println("Collect your cash");
		System.out.println("Banking Activity Ended...");
	}
}

class Beta1 extends Thread
{
	@Override
	public void run()
	{
		printStar();
	}
	public void printStar() 
	{
		System.out.println("Printing Activity Started...");
		for(int i=0;i<4;i++)
		{
			System.out.println("*");
			try 
			{
				Thread.sleep(3000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Activity Ended...");
		
	
	}
}
class Gamma1 extends Thread
{
	@Override
	public void run()
	{
		imptMesg();
	}
	
	
	public void imptMesg() 
	{
		System.out.println("Printing important quote Started...");
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is the key to master any skills");
			try 
			{
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing important quote Ended...");
	}
}
public class MultiThreadingLauncher8 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread started the execution");
		Alpha1 thread1=new Alpha1();
		
		Beta1 thread2=new Beta1();
		
		Gamma1 thread3=new Gamma1();
		
		thread1.start();
		thread2.start();
		// We are now using join method we want to wait until thread1 and thread2 completes to start thread3
		thread1.join();
		thread2.join();
		// Now we want thread 3 to start
		thread3.start();
		// Waiting till all three threads finsh to end main thread
		thread1.join();
		thread2.join();
		thread3.join();
		System.out.println("Main Thread finished the execution");
		

	}

}
