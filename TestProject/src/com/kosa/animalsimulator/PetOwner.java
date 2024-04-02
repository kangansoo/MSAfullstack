package com.kosa.animalsimulator;

public class PetOwner {
	public void start() {
		Vet vet = new Vet();
		
		Dog dog = new Dog();
		Hippo hippo = new Hippo();
		Rabbit rabbit = new Rabbit();
		
		vet.giveShot(dog);
		vet.giveShot(hippo);
		vet.giveShot(rabbit);
	}
}
