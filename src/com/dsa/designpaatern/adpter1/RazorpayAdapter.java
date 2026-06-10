package com.dsa.designpaatern.adpter1;

public class RazorpayAdapter implements   PaymentProcessor{
    private RazorpayGateway razorpay = new RazorpayGateway();

    @Override
    public void pay(double amount) {
        razorpay.processTransaction(amount);
    }
}
