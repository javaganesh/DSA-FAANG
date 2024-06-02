package com.dsa.math;

public class ProductSumTwoArry {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        productSumArry(arr1,arr2);

    }

    private static void productSumArry(int[] arr1, int[] arr2) {
        int sum1=0;
        int sum2=0;

        for(int i=0;i< arr1.length;i++){
            sum1+=arr1[i];
        }

        for(int i=0;i< arr1.length;i++){
            sum2+=arr2[i];
        }
        System.out.println(sum1*sum2);
    }
}
