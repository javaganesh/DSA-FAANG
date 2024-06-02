package com.dsa.loop;

public class PerfectNumberOrnot {
    private static void checkPerfectNumberOrnt(int n){

        while(n%2==0){
            n/=2;
        }
        if(n==1){
            System.out.println(" Perfect Number of power of 2");
        }
        else{
            System.out.println(" not Perfect Number of power of 2");
        }
    }

    public static void main(String[] args) {
    for(int i=2;i<100;i++){
        checkPerfectNumberOrnt(i);
    }


    }
}
