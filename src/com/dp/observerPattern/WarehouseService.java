package com.dp.observerPattern;

public class WarehouseService implements Observer {

    @Override
    public void update(Order order) {

        System.out.println(
                "Warehouse notified.");

    }

}
