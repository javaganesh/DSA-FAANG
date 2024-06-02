package com.dsa.array.subArray;

public class MakimumProductOfSubArray {
    public static void main(String[] args) {
        int []arr = { 1, 2, -5, -4 };
        int product = -10;
        int n = arr.length;

        if (maxProduct(arr, n, product))
        {
            System.out.println( "YES");
        }
        else
            System.out.println( "NO");
    }

    private static boolean maxProduct(int[] arr, int n, int product) {

        // Variables to store maximum
        // and minimum product till
        // ith index.
        int minVal = arr[0];
        int maxVal = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < n; i++) {
        if(arr[i]<0){
            int temp=maxVal;
            maxVal=minVal;
            minVal=temp;
        }
            // maxVal and minVal stores
            // the product of subarray
            // ending at arr[i].
            maxVal = Math.max(arr[i],
                    maxVal * arr[i]);
            minVal=Math.max(arr[i],minVal*arr[i]);
            // Check if the current product
            // is equal to the given product
            if (minVal == product || maxVal == product)
            {
                return true;
            }
            // Max Product of array.
            maxProduct = Math.max(maxProduct,maxVal);
        }

            return false;
    }

}
