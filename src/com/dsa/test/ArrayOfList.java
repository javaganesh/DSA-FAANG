package com.dsa.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfList {
    private static void processList(int[] arr, List<List<Integer>> listOflist) {

        for(int ele:arr){
          int  idex=(ele<10)?0:(ele<20?1:2);
            listOflist.get(idex).add(ele);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        List<List<Integer>> listOflist=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listOflist.add(new ArrayList<>());
        }
        processList(arr,listOflist);
        System.out.println(listOflist);


    }


}
