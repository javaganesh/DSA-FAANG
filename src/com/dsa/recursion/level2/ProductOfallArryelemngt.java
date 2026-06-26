package com.dsa.recursion.level2;

public class ProductOfallArryelemngt {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(productOfAllArray(arr,0));
    }

    private static int productOfAllArray(int[] arr, int idx) {
        if(idx==arr.length) return 1;

        int rm=productOfAllArray(arr,idx+1);
        return arr[idx]*rm;
    }
}
