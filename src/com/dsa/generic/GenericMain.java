package com.dsa.generic;

public class GenericMain {
    public static void main(String[] args) {
        Box<Integer> box=new Box();
        box.setValue(10);;
       int value =  box.getValue();
        System.out.println(value);
        Box<String> box1=new Box();
        box1.setValue("Ganesh");;
        System.out.println(box1.getValue());


    }
}
