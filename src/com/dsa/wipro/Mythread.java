package com.dsa.wipro;

public class Mythread  extends  Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        Mythread low=new Mythread();
        low.setName("Low");
        low.setPriority(Thread.MIN_PRIORITY);

        Mythread medium=new Mythread();
        medium.setName("medium");
        medium.setPriority(Thread.NORM_PRIORITY);

        Mythread high=new Mythread();
        high.setName("high");
        high.setPriority(Thread.MAX_PRIORITY);
        low.start();
        medium.start();
        high.start();

    }
}
