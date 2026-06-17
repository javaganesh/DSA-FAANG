package com.dsa.multiThreading;

public class DeadlockDemo {
    static Object pen = new Object();
    static Object book = new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{

            synchronized (pen) {
                System.out.println("Thread-1 got Pen");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            synchronized (book) {
                System.out.println("Thread-1 got book");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {}


        });

        Thread t2=new Thread(()->{

            synchronized (book) {
                System.out.println("Thread-2 got book");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            synchronized (pen) {
                System.out.println("Thread-2 got pen");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {}


        });

        t1.start();
        t2.start();

    }
}
