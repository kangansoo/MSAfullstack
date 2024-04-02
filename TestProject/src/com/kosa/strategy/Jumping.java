package com.kosa.strategy;

public class Jumping implements Movebehavior {

	@Override
	public void move() {
		System.out.println("점프로 이동");
	}

}
