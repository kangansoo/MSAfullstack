package com.kosa.generictypes;

public class TestDrive {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
		
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
	}

}