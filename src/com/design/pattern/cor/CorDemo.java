package com.design.pattern.cor;

public class CorDemo {
    public static void main(String[] args) {
        // crate username password authentication filter
        Filter usernamePasswordAuthenticationFilter = new UsernamePasswordAuthenticationFilter();

        // create jwt filter
        Filter jwtFilter = new JwtFilter();

        // create filter chain
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(usernamePasswordAuthenticationFilter);
        filterChain.addFilter(jwtFilter);

        // create dispatcher servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(filterChain.getFilterChain());

        dispatcherServlet.request("admin", "admin");
    }
}
