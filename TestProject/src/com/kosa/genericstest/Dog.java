package com.kosa.genericstest;

import java.util.Comparator;

public class Dog extends Animal<String> implements Comparator<Dog>{
	private String name;
	
    public Dog(String name) {
        super("강아지");
        this.name = name;
    }
    
    public Dog() {
        super("강아지");
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public void makeSound() {
        System.out.println("멍멍");
    }

	@Override
	public int compare(Dog dog1, Dog dog2) {
		return dog1.getName().compareTo(dog2.getName());
	}

	@Override
	public String toString() {
		return name;
	}
	
}
