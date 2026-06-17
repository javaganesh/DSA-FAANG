package com.dsa.designpaatern.FactoryitSolid;

public class CardPaymentFactory implements PaymentFactory{
    @Override
    public Payment create() {
        return new CardPayment();
    }
}
