package com.design.pattern.template;

public abstract class FrameworkAction {
    public void auth() {
        System.out.println("auth");
    }
    public abstract void businessAction();
    public  void log(){
        System.out.println("log");
    }

    public void run() {
        auth();
        businessAction();
        log();
    }
}
