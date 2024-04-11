package com.kosa.genericstest;

public class Person {
	protected String name;
	
	public Person() {}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "이름: " + name;
	}
	
}
