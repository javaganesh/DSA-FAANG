package com.dsa.array.subArray;

import java.util.ArrayList;
import java.util.List;

public class SubarrayofsizeKwithGivensum {
    public static boolean subarrayofsizeKwithGivensum(int[] arr,int k,int sum){
        for (int i = 0; i < arr.length - k + 1; i++)
        {
            int current_sum = 0;

            // Consider each
            // subarray of size k
            for (int j = 0; j < k; j++)
                current_sum = current_sum +
                        arr[i + j];
            if (current_sum == sum)
                return true;

        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=4,sum=18;
        System.out.println(arr.length - k + 1);
        System.out.println( subarrayofsizeKwithGivensum(arr,k,sum));
    }
}
