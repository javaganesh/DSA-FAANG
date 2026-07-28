package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class PrintSubset {
    static void solve(int[] arr, int start, List<Integer> subset) {
        System.out.println(subset);
        for(int i=start;i<arr.length;i++){
            subset.add(arr[i]);
            solve(arr, start+1, subset);
            subset.remove(subset.size()-1);
        }

    }

        public static void main(String[] args) {
        int[] arr={10,20,30};
        solve(arr,0,new ArrayList<>());

    }
}
