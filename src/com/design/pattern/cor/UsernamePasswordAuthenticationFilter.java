package com.design.pattern.cor;

import org.junit.platform.commons.util.StringUtils;

public class UsernamePasswordAuthenticationFilter extends Filter {

    @Override
    void doFilter(String username, String password) {
        System.out.println("Do username password authentication filter");
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
            if (this.getNextFilter() != null) {
                this.getNextFilter().doFilter(username, password);
            } else {
                DispatcherServlet.doDispatch(username, password);
            }
        }
        else {
            throw new RuntimeException("username or password is null");
        }
    }

}
