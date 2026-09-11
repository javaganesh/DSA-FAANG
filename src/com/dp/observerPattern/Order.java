package com.dp.observerPattern;

public class Order {

    private String orderId;
    private String customerName;
    private String email;
    private String mobile;
    private double amount;

    public Order(String orderId,
                 String customerName,
                 String email,
                 String mobile,
                 double amount) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public double getAmount() {
        return amount;
    }
}