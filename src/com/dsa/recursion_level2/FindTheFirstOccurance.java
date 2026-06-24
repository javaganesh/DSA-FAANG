package com.dsa.recursion_level2;

public class FindTheFirstOccurance {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50};
        int target = 20;
        System.out.println(findTheFirstOccurance(arr,0,target));
    }

    private static int findTheFirstOccurance(int[] arr, int idx, int target) {
           if(idx > arr.length-1) return -1;

        /*int remain=findTheFirstOccurance(arr,idx+1,target);
        if(arr[idx]==target){
            return idx;
        }
        else {
            return remain;
        }
*/        if(arr[idx] ==target) return idx;
          return findTheFirstOccurance(arr,idx+1,target);

    }
}
