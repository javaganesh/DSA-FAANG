package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 8, 12, 15, 21, 42, 49, 99};
        int[] arr2 = {5, 7, 10, 20, 51, 80, 91};
        List<Integer> evenList=new ArrayList<>();
        List<Integer> oddList=new ArrayList<>();

        int p1=0;
        int p2=0;

        while (p1<arr1.length  && p2< arr2.length){
            if(arr1[p1]<arr2[p2]){
                if(p1<arr1.length ){

                    if(arr1[p1]%2==0){

                        evenList.add(arr1[p1]);
                    }
                    else {
                        oddList.add(arr1[p1]);

                    }
                }
                p1++;


            }

             else {

                if (p2 < arr2.length) {

                    if (arr2[p2] % 2 == 0) {
                        evenList.add(arr2[p2]);
                    } else {
                        oddList.add(arr2[p2]);

                    }
                }
                p2++;

            }




        }
        System.out.println(evenList);
        System.out.println(oddList);

    }
}
