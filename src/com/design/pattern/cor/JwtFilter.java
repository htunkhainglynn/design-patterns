package com.design.pattern.cor;

public class JwtFilter extends Filter {
    @Override
    void doFilter(String username, String password) {
        System.out.println("Do jwt filter");
        if (this.getNextFilter() != null) {
            this.getNextFilter().doFilter(username, password);
        } else {
            new DispatcherServlet(username, password).doDispatch();
        }
    }
}
