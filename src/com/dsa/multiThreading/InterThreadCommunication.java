package com.dsa.multiThreading;
class SharedResource {

    private boolean available = false;

    public synchronized void consume()
            throws InterruptedException {

        while (!available) {
            wait();
        }

        System.out.println("Consumed");

        available = false;
    }

    public synchronized void produce() {

        available = true;

        System.out.println("Produced");

        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource =
                new SharedResource();


        Thread consumer = new Thread(() -> {

            try {
                resource.consume();
            } catch (Exception e) {
            }
        });

        Thread producer = new Thread(() -> {
            resource.produce();
        });

        consumer.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        producer.start();
    }
}
