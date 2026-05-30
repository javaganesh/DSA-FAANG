package com.dsa.multiThreading;

public class Counter {
    private int count=0;

    public synchronized void  intcrement(){
        count++;
    }

    public int getCount(){
       return count;
    }

}
