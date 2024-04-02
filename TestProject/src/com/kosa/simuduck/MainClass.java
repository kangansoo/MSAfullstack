package com.kosa.simuduck;

public class MainClass {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		mallard.setQuackBehavior(new Squack());
		mallard.performQuack();
	}

}
