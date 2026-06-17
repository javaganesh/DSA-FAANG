package com.dsa.multiThreading;
public class BankApp {

    static ThreadLocal<String> currentUser =
            new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            currentUser.set("Ganesh");

            System.out.println(
                    Thread.currentThread().getName()
                            + " -> " + currentUser.get());
        });

        Thread t2 = new Thread(() -> {

            currentUser.set("Amit");

            System.out.println(
                    Thread.currentThread().getName()
                            + " -> " + currentUser.get());
        });

        t1.start();
        t2.start();
    }
}