package com.multiThread;

import java.util.concurrent.*;

/*
  4 player makig marthon
 */
class  Player implements Runnable{
    String playerName;
    CyclicBarrier cyclicBarrier;

    public Player(String playerName,CyclicBarrier cyclicBarrier){
        this.playerName=playerName;
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        try {

            System.out.println(playerName +
                    " Finished Level 1");

            cyclicBarrier.await();

            System.out.println(playerName +
                    " Started Level 2");

        } catch (Exception e) {

            e.printStackTrace();

        }


    }
}
public class CycleBarierExample {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(4);

        ExecutorService executor =
                Executors.newFixedThreadPool(4);

        executor.submit(new Player("Ganesh", cyclicBarrier));

        executor.submit(new Player("Rahul", cyclicBarrier));

        executor.submit(new Player("Ankit", cyclicBarrier));

        executor.submit(new Player("Priya", cyclicBarrier));

        executor.shutdown();

    }
}
