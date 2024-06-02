package com.dsa.array.subArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArryWithEqualPart {
    public static void main(String[] args) {
        //twoEequalPart();
        int arr[] = {1 , 2 , 3 , 4 , 5 , 5 };
        int n = arr.length;
        printTwoParts(arr, n);



    }

    private static void printTwoParts(int[] arr, int n) {

        int splitPoint = findSplitPoint(arr, n);

        if (splitPoint == -1 || splitPoint == n )
        {
            System.out.println("Not Possible");
            return;
        }

        for (int i = 0; i < n; i++)
        {
            if(splitPoint == i)
                System.out.println();

            System.out.print(arr[i] + " ");

        }
    }

    private static int findSplitPoint(int[] arr, int n) {
        int leftSum = 0 ;
        // traverse array element
        for (int i = 0; i < n; i++)
        {
            // add current element to left Sum
            leftSum += arr[i] ;

            // find sum of rest array
            // elements (rightSum)
            int rightSum = 0 ;

            for (int j = i+1 ; j < n ; j++ )
                rightSum += arr[j] ;

            // split point index
            if (leftSum == rightSum)
                return i+1 ;
        }

        // if it is not possible to
        // split array into two parts
        return -1;
    }

    private static void twoEequalPart() {
        List<Integer> leftList=new ArrayList<>();
        List<Integer> rigtList=new ArrayList<>();
        int[] arr={ 1 , 2 , 3 , 4 , 5 , 5  };
        //int[] arr={ 4, 1, 2, 3 };
        // int[] arr={ 4, 3, 2, 1};
        //Arrays.sort(arr);
        int low=0;
        int high= arr.length-1;
        System.out.println(high);
        int leftSum=0;
        int rightSum=0;

        while(low<=high){

            if(leftSum<=rightSum){
                leftList.add(arr[low]);
                leftSum+=arr[low];
                low++;
            }
            else if(leftSum>rightSum){
                rigtList.add(arr[high]);
                rightSum+=arr[high];
                high--;
            }
            else{

                if(leftSum==rightSum) {
                    if(low<=high){
                        low++;
                        high--;
                    }
                }


            }
        }
        if(leftSum==rightSum){
            System.out.println(leftList+ "" +rigtList);
        }
        else{
            System.out.println("Not possible");
        }
    }
}
