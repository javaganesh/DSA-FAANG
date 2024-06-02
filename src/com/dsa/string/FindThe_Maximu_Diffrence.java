package com.dsa.string;

import java.util.Scanner;

public class FindThe_Maximu_Diffrence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=Integer. MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n= scanner.nextInt();;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max-min);

    }
}
