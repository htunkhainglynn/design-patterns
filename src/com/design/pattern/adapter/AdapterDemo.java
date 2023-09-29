package com.design.pattern.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Framework framework = new FrameworkAdapter();
        framework.add("Item 1");
        framework.add("Item 2");
        framework.add("Item 3");
    }
}
