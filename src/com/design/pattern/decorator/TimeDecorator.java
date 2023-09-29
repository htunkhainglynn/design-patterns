package com.design.pattern.decorator;

import java.time.LocalDate;

public class TimeDecorator implements Logger {
    Logger logger;

    public TimeDecorator(Logger logger) {
        this.logger = logger;
    }
    @Override
    public String log(String message) {
        return LocalDate.now() + " " + message;
    }
}
