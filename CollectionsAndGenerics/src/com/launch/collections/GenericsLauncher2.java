package com.launch.collections;
// Applying generics on normal class

interface int1{
	void display();
}

class Gen<T> implements int1{
	private T value;
	
	Gen(T value){
		this.value = value;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The type t is of "+ value.getClass().getName());
	}
	
	
}


public class GenericsLauncher2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> obj1= new Gen(100);
		obj1.display();
		Gen<String> obj2= new Gen("GK");
		obj2.display();
		
	}

}
