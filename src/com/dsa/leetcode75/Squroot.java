package com.dsa.leetcode75;

public class Squroot {
    public static int mySqrt(int x) {
        for(int i=0; i<x;i++){
            if(i*i==x){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
