package com.dsa.recursion;

public class FibNasic {
    private static void printfib(int n) {

       int fib0=0;
       int fib1=1;
       int res=0;
       for(int i=2;i<=n;i++){
           res=fib0+fib1;
           fib0=fib1;
           fib1=res;
       }
        System.out.println("fib:"+n+" -->"+res);


    }


    public static void main(String[] args) {
        printfib(10);
    }


}
