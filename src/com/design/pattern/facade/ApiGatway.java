package com.design.pattern.facade;

public class ApiGatway {

    void getOrderPage() {
        UserService userService = new UserService();
        userService.getLoginUser();

        OrderService orderService = new OrderService();
        orderService.getOrderLists();
    }
}
