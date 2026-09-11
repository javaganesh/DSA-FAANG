package com.dp.observerPattern;

public class InventoryService implements Observer {

    @Override
    public void update(Order order) {

        System.out.println(
                "Inventory updated for "
                        + order.getOrderId());

    }

}
