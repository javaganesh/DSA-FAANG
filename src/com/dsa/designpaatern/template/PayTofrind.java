package com.dsa.designpaatern.template;

public class PayTofrind extends PaymentTrsnfer{
    @Override
    public void addtoCart() {
        System.out.println("Added to card for frind");
    }

    @Override
    public void cashBack() {
        System.out.println("Cash back for 100 rupes");
    }

    @Override
    public void validate() {
        System.out.println("Validate SuccessCfully");

    }
}
