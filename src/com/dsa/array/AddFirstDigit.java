package com.dsa.array;

import java.util.Arrays;

public class AddFirstDigit {
    public static void main(String[] args) {
        int[] arr = {22, 33, 42};
        int sum = 0;
        for (int num : arr) {
            sum += findFirstDigit(num);
        }
        System.out.println(sum);

        int sum1 = Arrays.stream(arr)
                .map(AddFirstDigit::findFirstDigit)
                .sum();
        System.out.println(sum1);
    }

    private static int findFirstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }
}
