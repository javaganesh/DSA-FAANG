package com.dsa.recursion_level2;

public class FindTheLastoccuranceOfArray {
/*
    private static int findLastOccurance(int[] arr, int idx, int target) {
          if(idx> arr.length-1){
              return -1;
          }

        int lastOccuranceIndex=findLastOccurance(arr,idx+1,target);
        if(lastOccuranceIndex==-1){
            if(arr[idx]==target){
                return idx;
            }
            else {
              return   -1;
            }
        }
        else {
            return lastOccuranceIndex;
        }
    }
*/
static int lastOccurrence(int[] arr, int idx, int target) {

    if(idx == arr.length)
        return -1;

    int ans = lastOccurrence(arr, idx + 1, target);

    if(ans != -1)
        return ans;

    if(arr[idx] == target)
        return idx;

    return -1;
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,5,6,3,7};
        int target=3;
        //System.out.println("find the last occurenace:"+findLastOccurance(arr,0,target));
        System.out.println("find the last occurenace:"+lastOccurrence(arr,0,target));
    }


}
