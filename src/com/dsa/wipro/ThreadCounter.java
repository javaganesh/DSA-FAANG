package com.dsa.wipro;

public class ThreadCounter extends Thread{
    private Counter counter;

    ThreadCounter(Counter counter){
        this.counter=counter;

    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.incement();
        }
    }
}
