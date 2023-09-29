package com.design.pattern.prototype;

public class HeavyObject implements Prototype {

    String computeIntensiveProperty;

    static String getComputeIntensiveProperty() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted");
        }
        return "Compute Intensive Property";
    }

    public HeavyObject() {
        this.computeIntensiveProperty = getComputeIntensiveProperty();
    }

    @Override
    public HeavyObject reproduce() {
        try{
            // implementing Cloneable interface and overriding clone() method can copy the object properties
            Prototype prototype = (Prototype) super.clone();
            return (HeavyObject) prototype;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }
}
