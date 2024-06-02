package com.dsa.recursion;

public class ReveseNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int stIdx=0;
        int endIdx= arr.length;
        reverSeNumber(arr,stIdx,endIdx);

    }

    private static void reverSeNumber(int[] arr, int stIdx, int endIdx) {
        if(stIdx==endIdx){
            return;
        }
        System.out.println(arr[stIdx]);
        reverSeNumber(arr, stIdx+1, endIdx);
        System.out.println("\n");
        System.out.println(arr[stIdx]);
    }


}
