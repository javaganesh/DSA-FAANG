package com.dsa.recursion_forLoop;

public class Expriment {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            hello(i);
        }
    }

    private static void hello(int i) {
        if(i==3) return;
        System.out.println("hello:"+i);
        hello(i+1);
    }
}
