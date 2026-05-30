package com.dsa.patter;

import java.util.Scanner;

public class PrintTranleUsingMath {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        /*for(int i=1;i<n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print("%"+" ");
            }
            System.out.println();
        }*/
        int a=n;
        for(int i=1;i<n;i++){
            for(int j=1;j<a;j++){
                System.out.print(j+" ");
            }
            a--;
            System.out.println();
        }
    }
}
