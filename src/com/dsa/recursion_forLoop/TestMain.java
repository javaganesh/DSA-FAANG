package com.dsa.recursion_forLoop;

public class TestMain {
    /*public static void hello(int level){
        if(level==2) {
            return;
        }
        for(int i=1;i<=2;i++) {
            System.out.println("loop:"+i +"  "+"Level:"+level);
        }
        hello(level+1);
    }*/

    public static void hello(int level){
        if(level==3) {
            return;
        }
        for(int i=1;i<=2;i++) {
            System.out.println("loop:"+i +"  "+"Level:"+level);
            hello(level+1);
        }

    }
    public static void main(String[] args) {
           hello(0);

    }
}
