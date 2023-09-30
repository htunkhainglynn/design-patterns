package com.design.pattern.facade;

public class FacadeDemo {

    public static void main(String[] args) {
        ApiGatway apiGatway = new ApiGatway();
        apiGatway.getOrderPage();
    }
}
