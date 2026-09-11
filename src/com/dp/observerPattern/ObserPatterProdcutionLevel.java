package com.dp.observerPattern;

public class ObserPatterProdcutionLevel {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.subscribe(new EmailService());
        service.subscribe(new SMSService());
        service.subscribe(new InventoryService());
        service.subscribe(new InvoiceService());
        service.subscribe(new AnalyticsService());
        service.subscribe(new WarehouseService());
        service.subscribe(new RewardPointService());


        Order order = new Order(
                "ORD101",
                "Ganesh",
                "ganesh@gmail.com",
                "9876543210",
                5000
        );

        service.placeOrder(order);
    }
}
