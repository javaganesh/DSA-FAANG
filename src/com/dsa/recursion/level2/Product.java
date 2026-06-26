package com.dsa.recursion.level2;

public class Product {
    private static int productOfArray(int[] arr, int idx) {
        if(idx==arr.length){
            return 1;
        }

       int rm =productOfArray(arr,idx+1);
        return arr[idx]*rm;

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println( productOfArray(arr,0));
    }


}
