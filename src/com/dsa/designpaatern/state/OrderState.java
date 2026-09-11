package com.dsa.designpaatern.state;

public interface OrderState {

    void next(OrderContext context);

}