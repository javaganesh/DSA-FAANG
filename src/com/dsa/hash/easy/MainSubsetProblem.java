package com.dsa.hash.easy;

import java.util.HashSet;

public class MainSubsetProblem {
    static boolean isSubset(int arr1[], int arr2[], int m,
                            int n)
    {
        int i = 0;

        sort(arr1, 0, m - 1);
        for (i = 0; i < n; i++) {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
                return false;
        }

        /* If we reach here then all elements of arr2[]
          are present in arr1[] */
        return true;
    }
    /* Standard Binary Search function*/
    static int binarySearch(int arr[], int low, int high,
                            int x)
    {
        if (high >= low) {
            /*low + (high - low)/2;*/
            int mid = (low + high) / 2;

            /* Check if arr[mid] is the first occurrence of
            x. arr[mid] is first occurrence if x is one of
            the following is true: (i)  mid == 0 and
            arr[mid] == x (ii) arr[mid-1] < x and arr[mid]
            == x
         */
            if ((mid == 0 || x > arr[mid - 1])
                    && (arr[mid] == x))
                return mid;
            else if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high,
                        x);
            else
                return binarySearch(arr, low, (mid - 1), x);
        }
        return -1;
    }

    static void sort(int arr[], int low, int high)
    {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* This function takes last element as pivot,
      places the pivot element at its correct
      position in sorted array, and places all
      smaller (smaller than pivot) to left of
      pivot and all greater elements to right
      of pivot */
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static boolean usinghashSet(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])) {
                set.add(arr1[i]);
            }
        }
        for(int element:arr2){
            if(!set.contains(element)){
                return false;
            }
        }
        return true;
    }
    public static boolean usinghashSet1(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int elsement:arr1){
            set.add(elsement);

        }
        for(int elsement:arr2){
            set.add(elsement);

        }
        return set.size()==arr1.length;
    }


    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };

        int m = arr1.length;
        int n = arr2.length;

        /*if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print(
                    "arr2[] is not a subset of arr1[]");*/

        if (usinghashSet1(arr1, arr2))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print(
                    "arr2[] is not a subset of arr1[]");

    }
}
