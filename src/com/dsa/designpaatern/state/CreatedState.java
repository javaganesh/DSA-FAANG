package com.dsa.designpaatern.state;

public class CreatedState implements OrderState {

    @Override
    public void next(OrderContext context) {

        System.out.println("Payment Received");

        context.setState(new PaidState());

    }

}