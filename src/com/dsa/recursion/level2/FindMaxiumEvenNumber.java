package com.dsa.recursion.level2;

public class FindMaxiumEvenNumber {
    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 5, 20, 24,28,7};
        System.out.println(findMaxiumEvn(arr,0));

    }

    private static int findMaxiumEvn(int[] arr, int idx) {
        if(idx>=arr.length){
            return Integer.MIN_VALUE;
        }
        int remax= findMaxiumEvn(arr,idx+1);
        if(arr[idx]%2==0){
            return Math.max(arr[idx],remax);
        }
        else return remax;

    }
}
