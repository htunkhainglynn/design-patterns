package com.design.pattern.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        Subscriber subscriber3 = new Subscriber("Subscriber 3");
        dataSource.register(subscriber1);
        dataSource.register(subscriber2);
        dataSource.register(subscriber3);
        dataSource.change(" has been updated");
        dataSource.unregister(subscriber2);
        dataSource.change(" has been updated again");
    }
}
