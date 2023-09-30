package com.design.pattern.cor;

public class DispatcherServlet {

    private final String username;
    private final String password;

    public DispatcherServlet(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void doDispatch() {
        System.out.println("username: " + username + ", password: " + password);
    }
}
