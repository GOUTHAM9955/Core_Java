package com.launch.multithreading;


class MSWord1 extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("TYPE"))
		{
			typing();
		}
		else if(name.equals("SPELL"))
		{
			spellCheck();
		}
		else
		{
			saving();
		}
	}
	
	public void typing()
	{
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("Typing.....");
				Thread.sleep(4000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void spellCheck()
	{
		try
		{
			for(;;)
			{
				System.out.println("Spell Checking.....");
				Thread.sleep(4000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void saving()
	{
		try
		{
			for(;;)
			{
				System.out.println("Saving.....");
				Thread.sleep(4000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class PractiseLauncher 
{

	public static void main(String[] args) 
	{
		MSWord1 t1=new MSWord1();
		MSWord1 t2=new MSWord1();
		MSWord1 t3=new MSWord1();
		
		t1.setName("TYPE");
		t2.setName("SPELL");
		t3.setName("SAVE");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(3);
		t3.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
