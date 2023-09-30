package com.design.pattern.strategy;

public class Context {
    private final PaymentGateway paymentGateway;

    public Context(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void pay(int amount) {
        paymentGateway.pay(amount);
    }
}
