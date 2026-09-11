package com.multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.CountDownLatch;

class Team implements Runnable {

    private CountDownLatch latch;
    private String teamName;

    public Team(CountDownLatch latch,
                String teamName) {

        this.latch = latch;
        this.teamName = teamName;
    }

    @Override
    public void run() {

        System.out.println(teamName + " Started");

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }

        System.out.println(teamName + " Finished");

        latch.countDown();

    }

}
public class CountDownLatchExample {
    public static void main(String[] args) throws Exception {

        CountDownLatch latch =
                new CountDownLatch(4);

        ExecutorService executor =
                Executors.newFixedThreadPool(4);

        executor.submit(new Team(latch,"fuel"));
        executor.submit(new Team(latch,"weathere"));
        executor.submit(new Team(latch,"Security"));
        executor.submit(new Team(latch,"Navigation"));
        latch.wait();
        System.out.println("Rocket is Lunching");
        executor.shutdown();

    }
}
