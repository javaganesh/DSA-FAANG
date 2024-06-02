package com.dsa.string;

import java.util.Arrays;

public class FrequncyOfArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int[] fre=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            fre[arr[i]]++;
        }
        Arrays.stream(fre).forEach(f->{
            System.out.println(f);
        });
    }
}
