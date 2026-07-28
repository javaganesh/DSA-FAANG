package com.dsa.recursion_forLoop;

public class LoopWithRecursion {
    public static void print(int[] arr,int idx){


         if(idx>= arr.length) return;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
            print(arr,idx+1);
            System.out.println("loop resume:"+i);
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30};
        print(arr,0);
    }
}
