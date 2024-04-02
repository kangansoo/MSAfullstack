package com.kosa.animalsimulator;

public class Cat extends Feline {

	public void makeNoise() {
		System.out.println("고양이가 운다");
	}
	public void eat() {
		System.out.println("고양이가 먹는다");
	}
	@Override
	void attack() {
		
	}

}
