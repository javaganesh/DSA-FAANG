package com.dsa.multiThreading;

class Mythread  extends  Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("Hello world !");
        }
    }
}

public class MainTest {
    public static void main(String[] args) {
     Mythread th=new Mythread();
     th.setDaemon(true);
       th.start();
        System.out.println("Done main thread");

    }
}
