package com.kosa.animalsimulator;

public class Dog extends Canine implements Pet{

	public void makeNoise() {
		System.out.println("개가 운다");
	}
	public void eat() {
		System.out.println("개가 먹는다");
	}
	@Override
	void attack() {
		
	}
	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}
