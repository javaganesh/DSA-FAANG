package com.dsa.designpaatern.state;

public class DeliveredState implements OrderState {

    @Override
    public void next(OrderContext context) {

        System.out.println("Already Delivered");

    }

}