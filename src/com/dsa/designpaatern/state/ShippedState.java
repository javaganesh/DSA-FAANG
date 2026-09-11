package com.dsa.designpaatern.state;

public class ShippedState implements OrderState {

    @Override
    public void next(OrderContext context) {

        System.out.println("Order Delivered");

        context.setState(new DeliveredState());

    }

}