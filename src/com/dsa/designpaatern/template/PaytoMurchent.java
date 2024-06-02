package com.dsa.designpaatern.template;

public class PaytoMurchent  extends PaymentTrsnfer{
    @Override
    public void addtoCart() {
        System.out.println("card added sucessfully for murchent");
    }

    @Override
    public void cashBack() {

        System.out.println("No cashback");
    }

    @Override
    public void validate() {

        System.out.println("Validate payment sucessfully");
    }
}
