package com.dsa.designpaatern.state;

public class PaidState implements OrderState {

    @Override
    public void next(OrderContext context) {

        System.out.println("Order Shipped");

        context.setState(new ShippedState());

    }

}