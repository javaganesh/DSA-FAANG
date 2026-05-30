package com.project;

public class Inter_test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{

                for (int i = 65; i < 69; i++) {
                    System.out.println((char) i);

                }



        });


        Thread t2=new Thread(()->{
            for(int i=1;i<5;i++){
                System.out.println( i);
            }
        });
         synchronized (Inter_test.class){
             try {
                 t1.start();
                 t1.wait(500);
                 t2.start();
                 t2.wait(500);
             }
             catch (Exception e){
                 e.printStackTrace();
             }


         }
              


    }
}
