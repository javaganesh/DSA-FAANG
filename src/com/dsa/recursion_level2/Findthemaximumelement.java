package com.dsa.recursion_level2;

public class Findthemaximumelement {
    private static int findMaxiumElemnt(int[] arr,int idx) {
        if(idx==arr.length) return 0;
        int smMax=findMaxiumElemnt(arr,idx+1);
        return arr[idx]+smMax;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println( findMaxiumElemnt(arr,0));
    }


}
