package com.dsa.designpaatern.state;

public class OrderContext {

    private OrderState state;

    public OrderContext() {

        state = new CreatedState();

    }

    public void setState(OrderState state) {

        this.state = state;

    }

    public void nextState() {

        state.next(this);

    }

}
