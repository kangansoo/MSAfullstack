package com.kosa.strategy;

public class MainClass {
	public static void main(String[] args) {
		Insect dragonfly = new Dragonfly();
		dragonfly.runAway();
		System.out.println("=====================================");
		
		dragonfly.setMovebehavior(new Flying());
		dragonfly.setEatbehavior(new Carnivory());
		dragonfly.performEat();
		dragonfly.performMove();
		dragonfly.attack();
		System.out.println("=====================================");

		Insect butterfly = new Butterfly();
		butterfly.setEatbehavior(new Herbivory());
		butterfly.performEat();
		butterfly.performMove();
		butterfly.attack();
		System.out.println("=====================================");
		
		Insect ant = new Ant();
		ant.setEatbehavior(new Omnivore());
		ant.setMovebehavior(new Crawling());
		ant.performEat();
		ant.performMove();
		ant.attack();
		System.out.println("=====================================");
		
		Insect grasshopper = new Grasshopper();
		grasshopper.setEatbehavior(new Omnivore());
		grasshopper.setMovebehavior(new Jumping());
		grasshopper.performEat();
		grasshopper.performMove();
		grasshopper.attack();
		
	}
}
