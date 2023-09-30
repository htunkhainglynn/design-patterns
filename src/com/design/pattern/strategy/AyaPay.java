package com.design.pattern.strategy;

public class AyaPay implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Pay with AyaPay, amount: " + amount);
    }
}
