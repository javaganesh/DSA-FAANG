package com.dsa.array;

public class SecondLargestElmentArray {
    private static void findTheSecondLargestElemtArray(int[] arr) {
        int max = Integer.MIN_VALUE;

        // First Traversal
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }

        int secondMax = Integer.MIN_VALUE;

        // Second Traversal
        for (int ele : arr) {
            if (ele != max && ele > secondMax) {
                secondMax = ele;
            }
        }

        System.out.println(max+" "+secondMax);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        findTheSecondLargestElemtArray(arr);
    }


}
