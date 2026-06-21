package com.dsa.gcp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortOnlyEvenNumbers {
    private static void sortEvenNumbers(int[] arr) {
        List<Integer> evens = new ArrayList<>();

        // Extract even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        for (int i = 0; i < evens.size() - 1; i++) {
            for (int j = 0; j < evens.size() - i - 1; j++) {

                if (evens.get(j) > evens.get(j + 1)) {

                    int temp = evens.get(j);
                    evens.set(j, evens.get(j + 1));
                    evens.set(j + 1, temp);
                }
            }
        }
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                arr[i] = evens.get(index++);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 1, 4, 5, 2};
        sortEvenNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }


}
