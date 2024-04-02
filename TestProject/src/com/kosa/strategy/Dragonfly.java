package com.kosa.strategy;

public class Dragonfly extends Insect {

	public Dragonfly() {
		movebehavior = new Flying();
		eatbehavior = new Carnivory();
	}
	@Override
	public void attack() {
		System.out.println("날아서 사냥을 합니다.");
	}

}
