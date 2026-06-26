package com.dsa.recursion.level2;

public class SumpostiveNumberUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {-5, 10, -2, 20, 15};
        System.out.println(positiveNumberUsingrecursion(arr,0));
    }

    private static int positiveNumberUsingrecursion(int[] arr,int idx) {
        if(idx>=arr.length){
            return 0;
        }

        int rem=positiveNumberUsingrecursion(arr,idx+1);
        if(arr[idx] > 0)
            return arr[idx] + rem;

        return rem;


    }
}
