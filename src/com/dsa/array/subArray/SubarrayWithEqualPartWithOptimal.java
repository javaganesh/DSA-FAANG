package com.dsa.array.subArray;

public class SubarrayWithEqualPartWithOptimal {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5 , 5 };
        int n = arr.length;

        printTwoParts(arr, n);


    }

    private static void printTwoParts(int[] arr, int n) {
        int splitPoint = findSplitPoint2(arr, n);

        if (splitPoint == -1 || splitPoint == n )
        {
            System.out.println("Not Possible" );
            return;
        }
        for (int i = 0; i < n; i++)
        {
            if(splitPoint == i)
                System.out.println();

            System.out.print(arr[i] + " ");
        }
    }

    private static int findSplitPoint2(int[] arr, int n) {
        int leftSum = 0;

        for (int i = 0 ; i < n ; i++)
            leftSum += arr[i];
        // again traverse array and compute right
        // sum and also check left_sum equal to
        // right sum or not
        int rightSum = 0;
        for(int i= n-1; i>=0;i-- ){
            // add current element to right_sum
            rightSum += arr[i];
            leftSum -= arr[i] ;
            if (rightSum == leftSum)
                return i ;
        }

        return -1;
    }

}
