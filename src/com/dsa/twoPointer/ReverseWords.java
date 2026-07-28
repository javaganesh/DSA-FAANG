package com.dsa.twoPointer;

public class ReverseWords {

    public static String reverseWords(String s) {

        char[] arr = s.toCharArray();

        // Step 1: Reverse entire array
        reverse(arr, 0, arr.length - 1);

        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                reverse(arr, start, end - 1);

                start = end + 1;
            }
        }

        return new String(arr);
    }

    private static void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }
}