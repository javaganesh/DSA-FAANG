package com.dsa.designpaatern.FactoryitSolid;

public class UPIPaymentFactory implements PaymentFactory {

    @Override
    public Payment create() {
        return new UpiPayement();
    }
}
