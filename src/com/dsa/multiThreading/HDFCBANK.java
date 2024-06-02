package com.dsa.multiThreading;

public class HDFCBANK {
     Double balance;
    HDFCBANK(Double balance){
        this.balance=balance;
    }
    public synchronized Double withdrow(Double withDrowAmount){
        return balance-withDrowAmount;
    }
    public synchronized Double deposite(Double depositeAmount){
        return balance+depositeAmount;
    }


}
