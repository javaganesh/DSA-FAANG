package com.dsa.testm;

/*
* Given two sorted arrays nums1 and nums2 of size m and n respectively,
*  return the median of the two sorted arrays.
*
*
* Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4,5,6] and median is (2 + 3) / 2 = 2.5.

 *
*
*
* */

public class test {
    public static void main(String[] args) {
        int[] arr1={1,2};
        int[] arr2={3,4};
    double midian=findMedian(arr1,arr2);
    System.out.println(midian);

    }

    private static Double findMedian(int[] arr1, int[] arr2) {
        int [] result=new int[arr1.length+arr2.length];
        int i=0,j=0;
        int k=0;
       while(i<arr1.length && j<arr2.length){
           if(arr1[i]<arr2[j]){
               result[k]=arr1[i];
               i++;

               k++;
           }
           else{
               result[k]=arr2[j];
               j++;

               k++;
           }
       }
       while(i<arr1.length){
           result[k]=arr1[i];
           i++;
           k++;
       }
        while(j<arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }


        int end= result.length;
        double median=0.0d;
        if(end%2!=0){
            median=result[(end)/2];
        }
        else{
            int mid=end/2;
         median=((result[mid-1] +result[mid])/2);
        }


        return median;


    }
}
