package com.design.pattern.decorator;

public class BasicLogger implements Logger{
    @Override
    public String log(String message) {
        return message;
    }
}
