package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class TragetSum {
    private static void solve(int[] arr,int curSum, int target,List<Integer> list) {

        if(curSum==target){
            System.out.println(list);
            return;
        }
        if(curSum>target){
            return;
        }
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            solve(arr,curSum+arr[i],target,list);
            list.remove(list.size()-1);

        }

    }
    public static void main(String[] args) {
        int[] arr={2,3};
        int target=5;
        List<Integer> list=new ArrayList<>();
        solve(arr,0,target,list);
    }


}
