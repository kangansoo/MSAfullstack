package com.kosa.genericstest;

public class Cat extends Animal<String> {
    public Cat() {
        super("고양이");
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}