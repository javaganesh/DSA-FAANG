package com.multiThread;

import java.util.concurrent.*;

class Student implements Runnable{
    private String name;
    private CyclicBarrier cyclicBarrier;
    public Student(String name,CyclicBarrier cyclicBarrier){
        this.name=name;
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        try{
            System.out.println("finished the section-1"+name);
            cyclicBarrier.await();
            System.out.println("start section-2:"+name);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Fanng_Chhalenge_CycleBarrierr {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.submit(new Student("Ganesh",cyclicBarrier));
        executorService.submit(new Student("Ramesh",cyclicBarrier));
        executorService.submit(new Student("Harish",cyclicBarrier));

        executorService.shutdown();

    }
}
