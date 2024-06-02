package com.dsa.designpaatern.template;

public abstract class PaymentTrsnfer {

    public abstract void addtoCart();
    public abstract void cashBack();
    public abstract void validate();

    public void sendMoney(){

        validate();
        addtoCart();
        cashBack();

    }




}
