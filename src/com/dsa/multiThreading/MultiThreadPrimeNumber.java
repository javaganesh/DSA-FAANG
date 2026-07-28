package com.dsa.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadPrimeNumber {
    static ReentrantLock lock=new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        int n=100;
        Thread t1=new Thread(()->{
                   // t1--accured lock hc-0
                 lock.lock();
                 try{
                     for (int i = 0; i < n; i++) {
                         if (checkPrimeNumber(i)) {
                             System.out.println(i);
                         }

                     }

                 }
                 finally {
                     lock.unlock();
                 }


        });

        Thread t2=new Thread(()->{
            // t1--accured lock hc-0
            lock.lock();
            try{
                for (int i = 0; i < n; i++) {
                    if (checkPrimeNumber(i)) {
                        System.out.println(i);
                    }

                }

            }
            finally {
                lock.unlock();
            }


        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }

    private static  boolean checkPrimeNumber(int b) {
        if(b<=1) return false;
        for(int i = 2; i*i< b; i++){
            if(b%i==0) return false;
        }
        return true;
    }
}


