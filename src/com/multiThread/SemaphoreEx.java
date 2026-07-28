package com.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Customer implements Runnable{
    private String name;
    private Semaphore semaphore;
    public Customer(String name,Semaphore semaphore){
        this.semaphore=semaphore;
        this.name=name;

    }

    @Override
    public void run() {
        try {
            System.out.println(name+" Waiting for ATM");
            semaphore.acquire();
            System.out.println(name+" Using ATM");
            Thread.sleep(3000);
            System.out.println(name+" finished With drow from ATM ");

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        finally {
            semaphore.release();
        }


    }
}

public class SemaphoreEx {
    public static void main(String[] args) {

        Semaphore semaphore=new Semaphore(2);
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        executorService.submit(new Customer("ganesh",semaphore));
        executorService.submit(new Customer("Preety",semaphore));
        executorService.submit(new Customer("Sriram",semaphore));
        executorService.submit(new Customer("Sonali",semaphore));

        executorService.shutdown();

    }
}
