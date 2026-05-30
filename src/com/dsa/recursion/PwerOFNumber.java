package com.dsa.recursion;

public class PwerOFNumber {
    private static int powerOfNumber(int base, int power) {
     if(power==0){
         return 1;
     }
        int tem=powerOfNumber(base,power-1);
     return base* tem;
    }
    public static void main(String[] args) {
        int res=powerOfNumber(3,3);
        System.out.println(res);
    }


}
