package com.design.pattern.observer;

public class Subscriber {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String change) {
        System.out.println(name + change);
    }
}
