package com.dsa.multiThreading;

public class CounterThread extends Thread {
    private Counter counter;
    CounterThread(Counter counter){
        this.counter=counter;

    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.intcrement();
        }
    }
}
