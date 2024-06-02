package com.dsa.multiThreading;

public class ClientMain {
    public static void main(String[] args) {
        HDFCBANK fb=new HDFCBANK(1000.00);
        GooglePay googlePay=new GooglePay(fb);
        googlePay.setName("Googlepay");
        googlePay.start();

        PhonePay phonePay=new PhonePay(fb);
        phonePay.setName("phonePay");
        phonePay.start();
        System.out.println(fb.balance);


    }
}
