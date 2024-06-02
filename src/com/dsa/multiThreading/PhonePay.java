package com.dsa.multiThreading;

public class PhonePay extends Thread{

    HDFCBANK hbd;
    public PhonePay(HDFCBANK hbd){
        this.hbd=hbd;

    }

    @Override
    public void run() {
        System.out.println("-->"+Thread.currentThread().getName()+"-->");

        hbd.withdrow(10000.00);
    }
}
