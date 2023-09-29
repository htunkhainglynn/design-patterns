package com.design.pattern.factory;


public class HtmlLogger implements LoggerFactory {

    @Override
    public void log(String message) {
        System.out.println("HtmlLogger: " + message);
    }
}
