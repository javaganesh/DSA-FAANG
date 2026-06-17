package com.dsa.multiThreading;

class IncrementCount {
    public int count = 0;
}

public class DataInConsitanceIssue {

    public static void main(String[] args) throws InterruptedException {

        IncrementCount incrementCount = new IncrementCount();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementCount.count++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementCount.count++;
            }
        });

        t1.start();
        t2.start();

        t1.join(); // Wait for t1
        t2.join(); // Wait for t2

        System.out.println("Count = " + incrementCount.count);
    }
}