package com.dsa.array;

import java.util.Arrays;

public class SortArryCorrectPostion {
    private static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[correct]!=arr[i]){
                swapElment(arr, i, correct);

            }
            else{
                i++;
            }

        }
    }

    private static void swapElment(int[] arr, int i, int correct) {
        int temp= arr[i];
        arr[i]= arr[correct];
        arr[correct]=temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 6, 1, 4 };

        // Function call
        sort(arr);

        // Printing the answer
        System.out.println(Arrays.toString(arr));
    }


}
