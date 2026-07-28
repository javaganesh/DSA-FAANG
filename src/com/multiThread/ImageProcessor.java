package com.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ImageProcessor implements Runnable{
    private  String imageName;
    Semaphore semaphore;

    public ImageProcessor(String imageName, Semaphore semaphore) {
        this.imageName = imageName;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(imageName+" wait for lock of semaphore ");
            semaphore.acquire();
            System.out.println(imageName+": processing the image");
            Thread.sleep(5000);
            System.out.println(imageName+": finished the imgage process");
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
       finally {
            System.out.println(imageName+" release the lock ");
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(3);
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        executorService.submit(new ImageProcessor("Ganesh",semaphore));
        executorService.submit(new ImageProcessor("Suresh",semaphore));
        executorService.submit(new ImageProcessor("Ramesh",semaphore));
        executorService.submit(new ImageProcessor("Preety",semaphore));
        executorService.submit(new ImageProcessor("Raghu",semaphore));
        executorService.submit(new ImageProcessor("Asis",semaphore));
        executorService.submit(new ImageProcessor("Kajal",semaphore));
        executorService.submit(new ImageProcessor("Dharmesh",semaphore));
        executorService.submit(new ImageProcessor("Naresh",semaphore));
        executorService.submit(new ImageProcessor("Raj",semaphore));
        executorService.submit(new ImageProcessor("Laxmi",semaphore));

    }
}
