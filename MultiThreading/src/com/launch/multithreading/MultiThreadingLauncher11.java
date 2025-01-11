package com.launch.multithreading;


// Inter thread communication
/*
 *  Communication between the threads of different class is called inter thread communication
 */

// Producer Consumer problem 
/*
 * The producer-consumer problem is a classic example of a multi-process synchronization problem. It involves two types of processes, 
 * the producer and the consumer, which share a common, fixed-size buffer used as a queue. The producer’s job is to generate data and put it into 
 * the buffer, and the consumer’s job is to consume the data from the buffer. Proper synchronization is required to ensure that the producer
 *  does not add data into a full buffer and the consumer does not remove data from an empty buffer.
 *  
 *  We can over come this by wait and notify methods calling within a synchronized block
 */

// Replicating the producer consumer problem
/*
class Queue{
	int data;
	
	public void produce(int data){
		this.data = data;
		System.out.println("I have produced data :" +data );
	}
	
	public void consume() {
		System.out.println("I have consumed data "+ data);
	}
}

class Produce extends Thread{
	
	Queue queue;
	int i;
	Produce(Queue q){
		queue = q;
	}
	@Override
	public void run() {
		while(true) {
		queue.produce(i++);
		}
	}
}

class Consumer extends Thread{
	Queue queue;
	Consumer(Queue q){
		queue =q;
	}
	
	@Override
	public void run() {
		while(true) {
			queue.consume();
		}
	}
}
*/
// Solving Producer Consumer problem

class Queue{
	int data;
	boolean flag =false;
	public synchronized void produce(int data) throws InterruptedException{
		if (flag == true) {
			System.out.println("Production in wait");
			wait();
		}
		
		else {
		this.data = data;
		System.out.println("I have produced data :" +data );
		flag = true;
		notify();
		}
		}
	
	public synchronized void consume() throws InterruptedException {
		if (flag == false) {
			System.out.println("Cusmption in wait");
			wait();
		}else {
		System.out.println("I have consumed data "+ data);
		flag = false;
		notify();
		}
	}
}

class Produce extends Thread{
	
	Queue queue;
	int i;
	Produce(Queue q){
		queue = q;
	}
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(2000);
			queue.produce(i++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class Consumer extends Thread{
	Queue queue;
	Consumer(Queue q){
		queue =q;
	}
	
	@Override
	public void run(){
		while(true) {
			try {
				Thread.sleep(3000);
				queue.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingLauncher11 {

	public static void main(String[] args) {

        Queue q = new Queue();
        Produce t1 = new Produce(q);
        Consumer t2 = new Consumer(q);

        t1.start();
        t2.start();


		
	}

}
