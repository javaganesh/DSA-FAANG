package com.dsa.backTracking1;

public class ExitingTraGet {
    static boolean existsSubset(
            int[] arr,
            int index,
            int sum,
            int target) {

        //no element
        if(index==arr.length){
            return false;
        }
        if(sum==target){
            return true;
        }


        boolean take=existsSubset(arr,index+1,sum+arr[index],target);
        if(take){
            return true;
        }
        boolean skip =existsSubset(arr,index+1,sum,target);
        return skip;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(existsSubset(arr,0,0,3));
    }
}
