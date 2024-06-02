package com.dsa.hash.easy;

import java.util.Set;
import java.util.TreeSet;

public class FindMissingRange {
    static void printMissingUsingHash(int ar[], int low, int high)
    {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i< ar.length;i++){
            set.add(ar[i]);
        }
        for(int i=low;i<=high;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }

    }
    static void findMissing(int[] arr, int n, int low,
                            int high){
        for (int i = low; i <= high; i++) {
            boolean found = false;
            // Loop through the array to check if i exists
            // in it
            for (int j = 0; j <n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If i is not found in the array, print it
            if (!found) {
                System.out.print(i + " ");
            }
        }


    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4 };
        int n = arr.length;
        int low = 1, high = 10;

        // Function call
      //  findMissing(arr, n, low, high);
        printMissingUsingHash(arr,low,high);
    }
}
