package com.dsa.recursion;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,10};

        int a=10;

        System.out.println(searchNumber(arr,0,a));
    }

    private static int searchNumber(int[] arr, int idx, int a) {

        if(idx== arr.length){
            return -1;
        }
        if(arr[idx]==a){
            return idx;
        }
        else {
         return  searchNumber(arr, idx+1, a);
        }

    }
}
