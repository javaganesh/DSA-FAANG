package com.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        System.out.println("Original arraylsit:"+arrayList);
        int i=0, j=arrayList.size()-1;
        while(i<j){
            int temp=arrayList.get(i);
            arrayList.set(i,arrayList.get(j));
            arrayList.set(j,temp);
            i++;
            j--;


        }
        System.out.println("after revderse:");
        System.out.println(arrayList);
    }

}
