package com.kosa.strategy;

public class Grasshopper extends Insect {

	public Grasshopper() {
		movebehavior = new Jumping();
		eatbehavior = new Omnivore();
	}
	@Override
	public void attack() {
		System.out.println("일단 먹고 봅니다.");
	}

}
