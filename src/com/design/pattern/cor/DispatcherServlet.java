package com.design.pattern.cor;

public class DispatcherServlet {
    FilterChain filterChain;

    public DispatcherServlet(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public void request(String username, String password) {
        if (filterChain instanceof Filter filter) {
            filter.doFilter(username, password);
        } else {
            doDispatch(username, password);
        }
    }

    public static void doDispatch(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
    }
}
