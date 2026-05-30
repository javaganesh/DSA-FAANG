package com.dsa.wipro;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter=new Counter();
        ThreadCounter t1=new ThreadCounter(counter);
        ThreadCounter t2=new ThreadCounter(counter);
         t1.start();
         t2.start();
         try {
             t1.join();
             t2.join();
        }
         catch (Exception e){
             e.printStackTrace();
         }

        System.out.println(counter.getCount());

    }
}
