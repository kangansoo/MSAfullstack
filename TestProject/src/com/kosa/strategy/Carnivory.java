package com.kosa.strategy;

public class Carnivory implements Eatbehavior {

	@Override
	public void eat() {
		System.out.println("작은 곤충 등을 잡아 먹습니다.");
	}

}
