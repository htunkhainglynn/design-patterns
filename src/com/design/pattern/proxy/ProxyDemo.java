package com.design.pattern.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        CommandExecutorProxy executor = new CommandExecutorProxy();
        try {
            executor.authenticate("admin", "admin");
            executor.execute("ls -ltr");
            executor.execute("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
