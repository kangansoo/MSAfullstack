package com.kosa.strategy;

public class Flying implements Movebehavior {

	@Override
	public void move() {
		System.out.println("날아서 이동");
	}

}
