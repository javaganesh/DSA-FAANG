package com.dsa.java8;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        for(int i=n;n>0;n/=10){
            int d=n%10;
            System.out.println(d);
              sum=sum+d;
            System.out.println("sum:"+sum
            );

            count++;
        }
        System.out.println(count);
        System.out.println("Final Sum:"+sum);

    }
}
