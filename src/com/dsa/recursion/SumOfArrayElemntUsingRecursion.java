package com.dsa.recursion;

public class SumOfArrayElemntUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sumOfelement=sumOfArryElment(arr,0);
        System.out.println(sumOfelement);
    }

    private static int sumOfArryElment(int[] arr, int idx) {
        if(idx==arr.length){
            return 0;
        }
        return arr[idx]+sumOfArryElment(arr,idx+1);
    }
}
