package com.dsa.string;

public class PrintOddAndEvenNumber {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    if(i%2==0){
                        System.out.print(Thread.currentThread().getName()+"  ");
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    if(i%2!=0){
                        System.out.print(Thread.currentThread().getName()+"  ");
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
