package com.launch.map;
// Annotations are used to provide the meta data(information about the code) to compiler then we use annotations

class Animal{
	public void animalWillHuntAndEat() {
		System.out.println("Animal hunts and eats");
	}
}

class Tiger extends Animal{
	// This will throw an error as the method name is not same, we didnt letter "a" is in small case in And.
	/*
	@Override
	public void animalWillHuntandEat() {
		System.out.println("Tiger will hunt and eat");
	}
	*/
	@Override
	public void animalWillHuntAndEat() {
		System.out.println("Tiger will hunt and eat");
	}
}

public class LaunchAnnotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger = new Tiger();
		tiger.animalWillHuntAndEat();

	}

}
