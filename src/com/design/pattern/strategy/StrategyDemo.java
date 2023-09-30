package com.design.pattern.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new AyaPay());
        context.pay(1000);

        context = new Context(new KbzPay());
        context.pay(2000);
    }
}
