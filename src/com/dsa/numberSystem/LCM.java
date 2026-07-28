package com.dsa.numberSystem;

public class LCM {
    public static  int lcm(int a,int b){
        int max=Math.max(a,b);
        while(true){
            if(max%a==0 && max%b==0) return max;


            max++;
        }

    }
    public static void main(String[] args) {
        System.out.println(lcm(15,20));
    }
}
