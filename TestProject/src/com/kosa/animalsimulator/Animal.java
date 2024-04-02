package com.kosa.animalsimulator;

public abstract class Animal {
	private String picture;
	private String food;
	private String hunger;
	private String boudaries;
	private String location;
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getHunger() {
		return hunger;
	}
	public void setHunger(String hunger) {
		this.hunger = hunger;
	}
	public String getBoudaries() {
		return boudaries;
	}
	public void setBoudaries(String boudaries) {
		this.boudaries = boudaries;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void makeNoise() {
		System.out.println("운다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
	public void sleep() {
		System.out.println("잔다");
	}
	public void roam() {
		System.out.println("배회한다");
	}
	abstract void attack();
	
}
