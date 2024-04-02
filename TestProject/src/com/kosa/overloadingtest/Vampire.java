package com.kosa.overloadingtest;

public class Vampire extends Monster {
	boolean frighten(int x) {
		System.out.println("a bite?");
		return false;
	}
}
