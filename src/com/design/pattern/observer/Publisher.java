package com.design.pattern.observer;

public interface Publisher {
    void register(Subscriber subscriber);
    void unregister(Subscriber subscriber);
    void change(String update);
}
