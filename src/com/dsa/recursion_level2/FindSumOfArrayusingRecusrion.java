package com.dsa.recursion_level2;

public class FindSumOfArrayusingRecusrion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum=0;
        findSumOfArrayusingRecusrion(arr,0,sum);

        System.out.println();


    }

    private static void findSumOfArrayusingRecusrion(int[] arr, int idx, int sum) {

        if(idx == arr.length){
            System.out.println(sum);
            return;
        }

        sum += arr[idx];

        findSumOfArrayusingRecusrion(arr, idx + 1, sum);
    }
}
