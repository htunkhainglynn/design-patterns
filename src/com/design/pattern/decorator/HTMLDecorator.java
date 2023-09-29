package com.design.pattern.decorator;

public class HTMLDecorator implements Logger {

    Logger logger;

    public HTMLDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String log(String message) {
        return "<h1>" + logger.log(message) + "</h1>";
    }
}
