package com.launch.multithreading;

//Demon thread(Secondary thread) are threads that are excuted once after every execution irrespective of no:of excecutions between the executions
		//Ex: gabage colloction

/*
 * Implementing demon thread
 * 		What ever thread we want to declare as demon thread we have to keep it in infinite loop
 */

//Let us consider a word with 3 functionalities typing, spellcheck and saving where we want to execute spell check and saving at the end

class MsWord extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		if (name == "type") {
			typing();
		}
		else if (name == "check") {
			spellcheck();
		}
		else {
			save();
		}
	}
	
	void typing() {
		try {
			for (int i =0;i<4;i++) {

				System.out.println("I am typing");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void spellcheck() {
		try {
			// Even though we keep it in infinite loop for demon thread executes based on the executions of primary thread which is typing 
			 	// in our example
			for (;;) {
				System.out.println("I am spell checker");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


void save() {
	try {
		for (;;) {
			System.out.println("I am saving");
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}



public class MultiThreadingLauncher10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsWord thread1 = new MsWord();
		MsWord thread2 = new MsWord();
		MsWord thread3 = new MsWord();
		
		thread1.setName("type");
		thread2.setName("check");
		thread3.setName("save");
		
		thread2.setDaemon(true);
		thread3.setDaemon(true);
		
		// For demon thread priority should be set less than 5 for demon thread
		// prority range 1->10 (hight-> low)
		thread2.setPriority(3);
		thread3.setPriority(4);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
