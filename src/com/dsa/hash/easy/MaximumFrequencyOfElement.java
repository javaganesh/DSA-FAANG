package com.dsa.hash.easy;

import java.util.Arrays;

public class MaximumFrequencyOfElement {

    private static int findMaxFrequency(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int maxFrequency = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxFrequency = Math.max(maxFrequency, count);
        }
        return maxFrequency;
    }

    private static int findElementWithMaxFrequency(int[] arr, int maxFrequency) {
        int count = 1;
        int elementWithMaxFrequency = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == maxFrequency) {
                elementWithMaxFrequency = arr[i];
            }
        }
        return elementWithMaxFrequency;
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 30, 40, 50, 30, 30};
        int maxFrequency = findMaxFrequency(arr);
        int elementWithMaxFrequency = findElementWithMaxFrequency(arr, maxFrequency);

        System.out.println(maxFrequency + " ===> " + elementWithMaxFrequency);
    }
}
