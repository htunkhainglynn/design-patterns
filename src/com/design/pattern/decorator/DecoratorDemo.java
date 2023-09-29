package com.design.pattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Logger logger = new HTMLDecorator(new BasicLogger());
        String log = logger.log("Basic Logger");
        System.out.println(log);

        logger = new HTMLDecorator(new TimeDecorator(new BasicLogger()));
        log = logger.log("Basic Logger");
        System.out.println(log);
    }
}
