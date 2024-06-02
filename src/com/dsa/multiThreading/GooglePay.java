package com.dsa.multiThreading;

public class GooglePay extends Thread {
    HDFCBANK  hdb=null;
     public GooglePay(HDFCBANK  hdb){
         this.hdb=hdb;
     }
    @Override
    public void run() {
        System.out.println(currentThread().getName());
       hdb.deposite(5000.00);

    }
}
