package com.dp.observerPattern;

public class SMSService implements Observer {

    @Override
    public void update(Order order) {

        System.out.println(
                "SMS sent to "
                        + order.getMobile());

    }

}