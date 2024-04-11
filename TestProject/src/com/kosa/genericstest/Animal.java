package com.kosa.genericstest;

public class Animal<T> {
    private T species;

    public Animal(T species) {
        this.species = species;
    }

    public T getSpecies() {
        return species;
    }

    public void makeSound() {
        System.out.println("소리를 내는 중");
    }
    
    @Override
    public String toString() {
        return species.toString();
    }
}
