package com.kosa.genericstest;

public class Tiger extends Animal<String> {
    public Tiger() {
        super("호랑이");
    }

    @Override
    public void makeSound() {
        System.out.println("어흥");
    }
}

