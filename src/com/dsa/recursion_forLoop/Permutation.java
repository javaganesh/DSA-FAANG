package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private static void printPermutation(int[] arr, boolean[] visited,List<Integer> anslist) {
        if(anslist.size()==arr.length){
            System.out.println(anslist);
            return;
        }

        for(int i=0;i< arr.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            anslist.add(arr[i]);
            printPermutation(arr,visited,anslist);
            anslist.remove(anslist.size()-1);
            visited[i]=false;

        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30};
        List<Integer> anslist=new ArrayList<>();
        boolean[] visited=new boolean[arr.length];
        printPermutation(arr,visited,anslist);
    }


}
