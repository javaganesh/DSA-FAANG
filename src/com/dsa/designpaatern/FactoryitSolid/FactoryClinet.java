package com.dsa.designpaatern.FactoryitSolid;

public class FactoryClinet {
    public static void main(String[] args) {
        PaymentFactory factory=new UPIPaymentFactory();
        Payment payment =factory.create();
        payment.pay();
    }
}
