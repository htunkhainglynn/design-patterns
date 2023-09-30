package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Publisher {

    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void register(Subscriber subscriber) {
        System.out.println("Registering " + subscriber.name);
        subscribers.add(subscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        System.out.println("Unregistering " + subscriber.name);
        subscribers.remove(subscriber);
    }

    @Override
    public void change(String update) {
        System.out.println("Notifying subscribers");
        for (Subscriber subscriber : subscribers) {
            subscriber.update(update);
        }
    }
}
