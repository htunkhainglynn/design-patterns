package com.design.pattern.proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void execute(String cmd) throws Exception {
        System.out.println("'" + cmd + "' command executed.");
    }
}
