package com.kosa.strategy;

public abstract class Insect {
	Movebehavior movebehavior;
	Eatbehavior eatbehavior;
	
	public Insect() {}
	public void setMovebehavior(Movebehavior movebehavior) {
		this.movebehavior = movebehavior;
	}
	public void setEatbehavior(Eatbehavior eatbehavior) {
		this.eatbehavior = eatbehavior;
	};
	
	public abstract void attack();
	public void performMove() {
		movebehavior.move();
	}
	public void performEat() {
		eatbehavior.eat();
	}
	public void runAway() {
		System.out.println("일단 도망치고 봅니다.");
	}
}
