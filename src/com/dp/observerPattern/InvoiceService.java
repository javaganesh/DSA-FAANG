package com.dp.observerPattern;

public class InvoiceService implements Observer {

    @Override
    public void update(Order order) {

        System.out.println(
                "Invoice generated.");

    }

}