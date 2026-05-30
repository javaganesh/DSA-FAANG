package com.dsa.multiThreading;

public class BankAccount {

    private int balance=1000;
    public void withdrowMoney(int amount){
        System.out.println(Thread.currentThread().getName()+" trying to accured the lock");
        if(balance>amount){
            balance-=amount;
        }

    }

}
