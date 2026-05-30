package com.dsa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfArray {
    public static void main(String[] args) {
        List<int[]> listArray=new ArrayList<>();
        listArray.add(new int[]{1,2,3});
        listArray.add(new int[]{11,22,30});
        listArray.add(new int[]{41,42,60});
        listArray.add(new int[]{51,52,53});
        for(int[] arr: listArray){
          for(int i=0;i<arr.length;i++){
           arr[i]=arr[i]+10;
          }
            System.out.println(Arrays.toString(arr));
        }
    }
}
