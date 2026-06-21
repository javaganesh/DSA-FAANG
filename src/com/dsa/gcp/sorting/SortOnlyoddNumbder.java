package com.dsa.gcp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortOnlyoddNumbder {
    private static void sortOddNumbers(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int el:arr){
            if(el%2==1){
                list.add(el);
            }
        }
        //apply the bubble sort here
        int n= arr.length;
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j)> list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                arr[i]=list.get(index++);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 1, 4, 5, 2};
        sortOddNumbers(arr);
        System.out.println(Arrays.toString(arr));

    }


}
