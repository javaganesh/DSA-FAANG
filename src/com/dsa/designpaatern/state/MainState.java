package com.dsa.designpaatern.state;

public class MainState {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.nextState();

        order.nextState();

        order.nextState();

        order.nextState();
    }
}
