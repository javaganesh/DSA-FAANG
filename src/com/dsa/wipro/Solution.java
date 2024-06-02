package com.dsa.wipro;

public class Solution {
    public int solution(int[] A, int[] B) {
        int calculateforA = calCulateFairIndex(A);
        int calculateforB = calCulateFairIndex(B);

        if (calculateforA == calculateforB) {
            return calculateforA;
        }

        return -1;
    }

    public int calCulateFairIndex(int[] arr) {
        int i = 0, j = arr.length - 1;
        int leftsum = 0;
        int rightsum = 0;

        for (int num : arr) {
            rightsum += num;
        }

        while (i < j) {
            if (leftsum <= rightsum) {
                leftsum += arr[i];
                i++;
            } else {
                rightsum -= arr[j];
                j--;
            }

            if (leftsum == rightsum) {
                break;
            }
        }

        return i - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {0, 4, -1, 3};
        int[] b = {0, -2, 5, 0};

        int fairIndex = s.solution(a, b);
        System.out.println("Fair Index: " + fairIndex);
    }
}
