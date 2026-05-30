package com.dsa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfArry {
    private static void processListOfArray(int[] num, List<Integer>[] arrayLists) {
        for(int n:num){
            int idx=(n<10)?0:(n<20?1:2);
            arrayLists[idx].add(n);
        }
    }
    public static void main(String[] args) {
        List<Integer> [] arrayLists=new ArrayList[3];
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        for(int i=0;i<3;i++){
            arrayLists[i]=new ArrayList<>();
        }
        processListOfArray(num,arrayLists);
        System.out.println(Arrays.toString(arrayLists));
    }


}
