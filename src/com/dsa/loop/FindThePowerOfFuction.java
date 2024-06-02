package com.dsa.loop;

public class FindThePowerOfFuction {
    public static void main(String[] args) {
        for(int i=2;i<100;i+=Math.pow(i,2)){
            System.out.println(i);
        }
    }
}
