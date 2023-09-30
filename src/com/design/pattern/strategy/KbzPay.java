package com.design.pattern.strategy;

public class KbzPay implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Pay with KbzPay, amount: " + amount);
    }
}
