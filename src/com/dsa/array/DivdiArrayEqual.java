package com.dsa.array;

public class DivdiArrayEqual {
    public static boolean devideArrayEqual(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) {
                flag = true;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, 5, 8, 20, -10, 8};
        System.out.println(devideArrayEqual(arr));
        devideArrayEqual1(arr);
    }

    private static boolean devideArrayEqual1(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        int totalSum = 0;
        int prifix = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += totalSum;
        }

        for (int i = 0; i < n - 1; i++) {
            prifix += arr[i];
            if (totalSum == 2 * prifix) {
                flag = true;
            }
        }
        return flag;
    }

}
