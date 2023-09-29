package com.design.pattern.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        HeavyObject heavyObject = new HeavyObject();
        System.out.println(heavyObject.computeIntensiveProperty);

        // doesn't need to wait for 2 seconds
        HeavyObject heavyObject1 = heavyObject.reproduce();
        System.out.println(heavyObject1.computeIntensiveProperty);
    }
}
