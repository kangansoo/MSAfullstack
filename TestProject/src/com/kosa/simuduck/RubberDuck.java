package com.kosa.simuduck;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("고무 오리");
	}

}
