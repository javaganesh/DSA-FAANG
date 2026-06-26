package com.dsa.recursion.level2;

import java.util.Arrays;

public class ReturnAllEvenNumbderUsingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(returnAllEvnNumber(arr,0)));
    }

    private static int[] returnAllEvnNumber(int[] arr, int idx) {

        if(idx == arr.length) {
            return new int[0];
        }
        int[] rem = returnAllEvnNumber(arr, idx + 1);
        if(arr[idx] % 2 == 0) {
            int[] ans = new int[rem.length + 1];
            ans[0] = arr[idx];
            for(int i = 0; i < rem.length; i++) {
                ans[i + 1] = rem[i];
            }
            return ans;
        }
        return rem;
    }
}
