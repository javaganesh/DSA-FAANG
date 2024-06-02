package com.dsa.array;

import java.util.Scanner;

public class Rotate90DArry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        char[][] arr=new char[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] =sc.next().charAt(0);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println("======================");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][arr.length-1]+" \t");
        }

    }
}
