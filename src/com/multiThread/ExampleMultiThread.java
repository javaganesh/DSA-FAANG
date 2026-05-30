package com.multiThread;
class Mythread extends  Thread{
    Mythread(){
        System.out.println("===========");
       run();


    }
    @Override
    public void run() {
        System.out.println("Hi");

    }
}

public class ExampleMultiThread {
    public static void main(String[] args) {
        Mythread t=new Mythread();
    }
}
