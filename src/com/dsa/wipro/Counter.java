package com.dsa.wipro;

public class Counter {

    private int count=0;

    public synchronized void incement(){
        count++;

    }
    public int getCount(){
        return count;
    }

}
