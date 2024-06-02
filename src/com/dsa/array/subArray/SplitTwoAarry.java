package com.dsa.array.subArray;

public class SplitTwoAarry {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5 , 5 };
        int n = arr.length;

        printTwoParts1(arr, n);
    }

    private static void printTwoParts1(int[] arr, int n) {
        int splitPoint = findSplitPoint1(arr, n);

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

    private static int findSplitPoint1(int[] arr, int n) {
        int leftSum = 0;

        for (int i = 0 ; i < n ; i++)
            leftSum += arr[i];
        int rightSum = 0;
        for(int i=n;i> 0;i--){
            rightSum+=arr[i];
            leftSum-=arr[i] ; ;

            if (leftSum==rightSum){}
            return i;

        }
        return -1;
    }
}
