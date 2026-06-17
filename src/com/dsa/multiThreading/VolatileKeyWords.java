package com.dsa.multiThreading;
class SharedData {

    volatile boolean running = true;
    volatile public int val=0;
}
public class VolatileKeyWords {
    public static void main(String[] args) {
        SharedData sharedData=new SharedData();
        Thread workerthread=new Thread(()->{
            while (sharedData.running) {
                sharedData.val++;

            }
            System.out.println("val:"+sharedData.val);
            System.out.println("Stopped");
        });

        workerthread.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        sharedData.running = false;
        System.out.println("main thread val:"+sharedData.val);
    }
}
