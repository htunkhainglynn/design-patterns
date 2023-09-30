package com.design.pattern.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public void authenticate(String user, String pwd) {
        if ("admin".equals(user) && "admin".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void execute(String cmd) throws Exception {
        if (isAdmin) {
            executor.execute(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.execute(cmd);
            }
        }
    }
}
