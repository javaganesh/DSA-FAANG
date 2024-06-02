package com.dsa.hash.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class SubsetProblme {

    private static boolean findThetwoArrayisSubsetToAnother(int[] a1, int[] a2) {
        HashMap<Integer,Boolean> hap=new HashMap<>();
      for(int i=0;i< a1.length;i++){
          if(!hap.containsKey(a1[i]))
          hap.put(a1[i],hap.containsKey(a1[i]));
      }
        System.out.println(hap);

      boolean isSubset=true;
      for(int i=0;i< a2.length;i++){
          if(!hap.containsKey(a2[i])){
              isSubset=false;
              break;
          }
      }


        return isSubset;
    }

    public static void main(String[] args) {
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 2};
        /*boolean isSubset = findThetwoArrayisSubsetToAnother(arr1, arr2);
        System.out.println(isSubset);*/

        System.out.println("arr2 is subset of arr1"+findThetwoArrayisSubsetToAnotherUsingBS(arr1, arr2));

    }
private static  boolean findElmentUsBs(int[] arr,int elment){
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int mid=(low+high)/2;
            if(arr[mid]==elment){
                return true;
            } else if (elment>=arr[mid]) {

                low=mid+1;

            }
            else{
                high=mid-1;

            }
        }
        return false;

}
    private static boolean findThetwoArrayisSubsetToAnotherUsingBS(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        boolean isPresent=true;
       for(int i=0;i<arr2.length;i++){
           if(!findElmentUsBs(arr1,arr2[i])){
               isPresent=false;
               break;
           }
       }
    return isPresent;
    }
}


