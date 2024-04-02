package com.kosa.overloadingtest;

public class Dragon extends Monster{
	boolean frighten(int degree) {
		System.out.println("breathe fire");
		return true;
	}
}
