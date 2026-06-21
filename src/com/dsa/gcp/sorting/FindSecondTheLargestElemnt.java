package com.dsa.gcp.sorting;

import static com.dsa.gcp.sorting.BubbleSortDescndingOder.swapLogic;

public class FindSecondTheLargestElemnt {
    public static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
    private static int findSecondLargestElemnt(int[] arr) {
        int n=arr.length;
        for(int i=0;i<2;i++){

            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    swapLogic(arr,j,j+1);
                }
            }

        }
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int[] arr={12,3,4,5,6,2,1};
        System.out.println(findSecondLargestElemnt(arr));
    }
}
