package com.dp.observerPattern;



public class EmailService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println(
                "Email sent to "
                        + order.getEmail());

    }
}
