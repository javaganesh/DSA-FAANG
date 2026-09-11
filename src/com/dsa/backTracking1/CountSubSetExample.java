package com.dsa.backTracking1;

public class CountSubSetExample {
    static int countSubsets(
            int[] arr,
            int index,
            int sum,
            int target) {

         if(sum>target){
             return 0;
         }
          if(index==arr.length){
              return sum==target?1:0;
          }
        int take=countSubsets(arr,index+1,sum+arr[index],target);
        int skip=countSubsets(arr,index+1,sum,target);

        return take+skip;



    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(countSubsets(arr,0,0,3));
    }
}
