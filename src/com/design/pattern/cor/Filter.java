package com.design.pattern.cor;

public abstract class Filter {
    Filter nextFilter;

    abstract void doFilter(String username, String password);

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public Filter getNextFilter() {
        return nextFilter;
    }
}
