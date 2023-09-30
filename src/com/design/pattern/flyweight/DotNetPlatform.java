package com.design.pattern.flyweight;

public class DotNetPlatform implements Platform {

    public DotNetPlatform() {
        System.out.println("DotNetPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing " + code.getCode() + " code.");
    }
}
