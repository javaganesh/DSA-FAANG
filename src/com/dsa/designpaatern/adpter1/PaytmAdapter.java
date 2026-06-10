package com.dsa.designpaatern.adpter1;

public class PaytmAdapter implements  PaymentProcessor{
    private PaytmGateway paytmGateway;

    public PaytmAdapter() {
        this.paytmGateway = new PaytmGateway();
    }

    @Override
    public void pay(double amount) {
        paytmGateway.makePayment(amount);
    }
}
