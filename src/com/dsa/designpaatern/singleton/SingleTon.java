package com.dsa.designpaatern.singleton;

import java.io.Serializable;

public class SingleTon  implements Serializable {
    //private static  SingleTon s=new SingleTon();//eagger inlization
    private static  SingleTon s;


    private SingleTon(){

    }

    public static SingleTon getInstance(){

        synchronized (s) {
            if (s == null) {
                s = new SingleTon();
                return s;
            }
        }
        return s;
    }

 Object readResolve(){
        return s;
 }


}
