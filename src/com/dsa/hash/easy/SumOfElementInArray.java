package com.dsa.hash.easy;

public class SumOfElementInArray {
    public static int sumOfNonCommon(int[] arr1, int[] arr2) {
        int sum = 0;
        boolean flag;

        for (int i = 0; i < arr1.length; i++) {
            flag = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sum += arr1[i];
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            flag = false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sum += arr2[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {4, 5, 6, 7, 8};
        System.out.println("Sum of non-common elements: " + sumOfNonCommon(A, B));
    }
}
