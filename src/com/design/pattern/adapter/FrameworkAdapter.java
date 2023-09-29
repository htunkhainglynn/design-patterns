package com.design.pattern.adapter;

public class FrameworkAdapter implements Framework {
    OldApi oldApi = new OldApi();  // same context so I dont use DI

    @Override
    public void add(String item) {  // delegate to oldApi
        oldApi.addItem(item);
    }
}
