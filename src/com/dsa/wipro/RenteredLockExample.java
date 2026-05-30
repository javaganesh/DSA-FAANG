package com.dsa.wipro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RenteredLockExample {

    private final Lock lock=new ReentrantLock();

    public void outrMethod(){
        lock.lock();
      try {

          System.out.println("outer-method lock");
          inerMethod();
          System.out.println("00000");
      }
      finally {
          lock.unlock();
          System.out.println("ourt method relsed the lock");
      }
    }

     public void inerMethod(){
         lock.lock();
         try {

             System.out.println("iner-method lock");

         }
         finally {
             lock.unlock();
             System.out.println("inner method relsed the lock");
         }
     }

    public static void main(String[] args) {
     RenteredLockExample re=new RenteredLockExample();
     re.outrMethod();
    }
}
