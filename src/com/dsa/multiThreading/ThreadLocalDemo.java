package com.dsa.multiThreading;

public class ThreadLocalDemo {
    private static ThreadLocal<String> user =
            new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

           user.set("Ganesh chandra Parida");

            System.out.println(
                    Thread.currentThread().getName()
                            + " -> " + user.get());
            user.remove();
            System.out.println(
                    Thread.currentThread().getName()
                            + " -> " + user.get());
        });

        Thread t2 = new Thread(() -> {

            user.set("Rakesh ");

            System.out.println(
                    Thread.currentThread().getName()
                            + " -> " + user.get());
        });

        t1.start();
        t2.start();


    }
}
