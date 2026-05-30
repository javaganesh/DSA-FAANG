package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        permutationoonArray(arr);

    }

    private static void permutationoonArray(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        dfs(arr,new ArrayList<Integer>(),result);
        System.out.println(result);

    }

    private static    void  dfs(int[] arr, ArrayList<Integer> perm, List<List<Integer>> result) {
        if(arr.length==perm.size()){
            result.add(new ArrayList<>(perm));
            return ;
        }
        for(int i=0;i< arr.length;i++){
            if(perm.contains(arr[i]))
                continue;
            perm.add(arr[i]);
            dfs(arr, perm, result);
            perm.remove(perm.size()-1);

        }


    }
}
