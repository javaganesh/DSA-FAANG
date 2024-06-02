package com.dsa.patter;

public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        int mid=n/2;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5;col++){
                if(row==mid+1 || col==mid+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }

        System.out.println("=============================================");
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5;col++){
                if(row==mid+1 || col==mid+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println("  ");
        }


    }
}
