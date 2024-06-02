package com.dsa.designpaatern.singleton;

import java.io.*;

public class ClloentApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingleTon singleTon1= SingleTon.getInstance();
        SingleTon singleTon2= SingleTon.getInstance();
        System.out.println(singleTon1.hashCode());
        System.out.println(singleTon2.hashCode());
        ObjectOutputStream obs=new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\GANESH PARIDA\\Downloads\\resume\\singleton.txt"));
        obs.writeObject(singleTon1);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\GANESH PARIDA\\Downloads\\resume\\singleton.txt"));
        SingleTon singleTon3=(SingleTon) ois.readObject();
        System.out.println(singleTon3.hashCode());



    }
}
