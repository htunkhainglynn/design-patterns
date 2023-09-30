package com.design.pattern.cor;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public Filter getFilterChain() {
        if (filters.isEmpty()) {
            return null;
        }
        Filter filter = filters.get(0);
        for (int i = 1; i < filters.size(); i++) {
            filter.setNextFilter(filters.get(i));
        }
        return filters.get(0);
    }
}
