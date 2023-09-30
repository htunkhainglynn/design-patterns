package com.design.pattern.cor;

public class CorDemo {
    public static void main(String[] args) {
        // crate username password authentication filter
        Filter usernamePasswordAuthenticationFilter = new UsernamePasswordAuthenticationFilter();

        // create jwt filter
        Filter jwtFilter = new JwtFilter();

        usernamePasswordAuthenticationFilter.setNextFilter(jwtFilter);
        usernamePasswordAuthenticationFilter.doFilter("username", "password");
    }
}
