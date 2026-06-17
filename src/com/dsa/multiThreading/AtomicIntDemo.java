package com.dsa.multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                System.out.println(count.get()+" ");
                count.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
              //  System.out.println(count.get()+" ");

                count.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.get());

    }
}
