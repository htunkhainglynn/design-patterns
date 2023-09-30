package com.design.pattern.di;

public class Client {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        car.start();

        engine = new GasEngine();
        // easy to test because engine can be mocked
        car = new Car(engine);
        car.start();
    }
}
