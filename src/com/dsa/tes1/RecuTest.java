package com.dsa.tes1;

public class RecuTest {
    public static int fun(int n){
        if(n==1) return 1 ;

        int rm=fun(n-1);
        rm =rm*10;
        return rm;



    }
    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}
