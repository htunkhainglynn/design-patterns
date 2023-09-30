package com.design.pattern.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {
        Code javaCode = new Code("Java Code...");
        Code dotNetCode = new Code("DotNet Code...");

        Platform javaPlatform = PlatformFactory.getPlatformInstance("JAVA");
        javaPlatform.execute(javaCode);

        Platform dotNetPlatform = PlatformFactory.getPlatformInstance("DOTNET");
        dotNetPlatform.execute(dotNetCode);

        javaPlatform = PlatformFactory.getPlatformInstance("JAVA");
        javaPlatform.execute(javaCode);
    }
}
