package com.kosa.classdiagramhw;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); 
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class Composition {
    public static void main(String[] args) {
        Car myCar = new Car("Hyundai", "V10");

        System.out.println("My car model: " + myCar.getModel());
        System.out.println("My car engine type: " + myCar.getEngine().getType());
    }
}
