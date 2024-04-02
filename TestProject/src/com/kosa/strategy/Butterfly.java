package com.kosa.strategy;

public class Butterfly extends Insect {

	public Butterfly() {
		movebehavior = new Flying();
		eatbehavior = new Herbivory();
	}
	@Override
	public void attack() {
		System.out.println("공격을 하지 않습니다.");
	}

}
