package com.game;

import java.util.Random;

public class Player {
	public int number;
	
	public void guess() {
		Random randomGenerator = new Random();
		number = randomGenerator.nextInt(10);
	}
}
