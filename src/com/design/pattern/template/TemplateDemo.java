package com.design.pattern.template;

public class TemplateDemo {
    public static void main(String[] args) {
        FrameworkAction action = new SaleAction();
        action.run();

        System.out.println("====================================");

        action = new ReportAction();
        action.run();
    }
}
