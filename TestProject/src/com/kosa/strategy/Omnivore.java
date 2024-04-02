package com.kosa.strategy;

public class Omnivore implements Eatbehavior {

	@Override
	public void eat() {
		System.out.println("아무거나 안 가리고 잘 먹습니다.");
	}

}
