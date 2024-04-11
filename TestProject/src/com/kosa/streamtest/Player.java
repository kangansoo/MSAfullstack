package com.kosa.streamtest;

import java.util.Comparator;

public class Player implements Comparable<Player>, Comparator<Player>{
	private String name;
	private int age;
	private String position;
	
	public Player(String name, int age, String position) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+", 나이: "+age+", 포지션: "+position;
	}
	
	@Override
	public int compareTo(Player player) {
		return this.name.compareTo(player.name);
	}
	
	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
