package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubset {
    private static List<List<Integer>> generateSubset(int idx, int[] arr, ArrayList<Integer> current, List<List<Integer>> result) {
      result.add((current));
       for(int i=idx;i< arr.length;i++){
           current.add(arr[i]);
           generateSubset(idx+1,arr,current,result);
           current.remove(current.size()-1);

       }
       return result;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        List<List<Integer>> subSet = generateSubset(0, arr, new ArrayList<>(), result);
        System.out.println(subSet);
    }


}
