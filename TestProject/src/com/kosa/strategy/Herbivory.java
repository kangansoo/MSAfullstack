package com.kosa.strategy;

public class Herbivory implements Eatbehavior {

	@Override
	public void eat() {
		System.out.println("식물의 잎이나 줄기 등을 먹습니다.");
	}

}
