package com.shapes;

public class ShapeDriveClass {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.rotate();
		shape.playSound();
		
		Square square = new Square();
		square.rotate();
		square.playSound();
		
		Amoeba amoeba = new Amoeba();
		amoeba.rotate();
		amoeba.playSound();
	}

}
