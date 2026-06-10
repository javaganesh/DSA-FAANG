package com.dsa.designpaatern.adpter1;

public class ClinentCode {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaytmAdapter();

        processor.pay(1000);


        PaymentProcessor processor1 = new RazorpayAdapter();
        processor1.pay(1000);
    }
    }

