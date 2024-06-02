package com.dsa.hash.easy;

import java.util.Arrays;

public class SumOfPairUsingtwoPointerTech {
  public static  boolean  sumOfPairUsingtwoPointer(int[] arr,int taget){
      int l, r;

      /* Sort the elements */
      Arrays.sort(arr);

        /* Now look for the two candidates
        in the sorted array*/
      l = 0;
      r = arr.length- 1;
      while (l < r) {
          if (arr[l] + arr[r] == taget)
              return true;
          else if (arr[l] + arr[r] < taget)
              l++;
          else // A[i] + A[j] > sum
              r--;
      }
      return false;
  }

    public static void main(String[] args) {
      int[] arr={1,2,3,5,7,9,10};
    sumOfPairUsingtwoPointer(arr,15);
    }
}
