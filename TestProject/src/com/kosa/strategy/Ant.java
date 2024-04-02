package com.kosa.strategy;

public class Ant extends Insect {

	public Ant() {
		movebehavior = new Crawling();
		eatbehavior = new Omnivore();
	}
	@Override
	public void attack() {
		System.out.println("떼로 지어 사냥을 하거나 주워먹습니다.");
	}

}
