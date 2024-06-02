package com.dsa.patter;

public class Patter5_Star {
    public static void print(){
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public static void print1(){
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++){
                System.out.print(i);
            }
            System.out.println("");

        }
    }
    public static void print2(){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.print(j+" ");
                }
               //
            }
            System.out.println("");

        }
    }
    public static void print4(){
        for(int i=1;i<5;i++)
        {
            for(int j=5;j>1;j--){
                System.out.print(i);
            }
            System.out.println("");

        }
    }
    public static void print5(){
        for(int i=5;i>0;i--)
        {
            for(int j=5;j>1;j--){
                System.out.print(i);
            }
            System.out.println("");

        }
    }
    public static void print6(){

        for(int i=5;i>0;i--)
        {
            for (int j=1;j<5;j++){
                System.out.print(j);
            }
            System.out.println("");

        }
    }

    public static void print3(){
        for(int i=1;i<5;i++)
        {
            for(int j=5;j>1;j--){
                System.out.print(j);
            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        print();
        System.out.println("================================================");
        print1();
        System.out.println("================================================");
        print2();
        System.out.println("================================================");
        print3();
        System.out.println("================================================");

        print4();
        System.out.println("================================================");
        print5();
        System.out.println("================================================");
        print6();
        System.out.println("================================================");



    }
}
