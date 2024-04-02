package com.kosa.animalsimulator;

public class AnimalDriveTest {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		
		Dog dog = new Dog();
		dog.roam();
		dog.makeNoise();
		
		Animal a = new Wolf();
		a.eat();
		a.makeNoise();
		a.roam();
		
		Animal b = new Dog();
		Dog d = (Dog) b;
		d.beFriendly();
		
	}

}