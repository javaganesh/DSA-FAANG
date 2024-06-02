package com.dsa.backtracking;

import java.util.Scanner;

public class PrithPath {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter nuymber of row:");
        int row=scanner.nextInt();
        System.out.println("Enter nuymber of row:");
        int col=scanner.nextInt();
        String s="";
        print(1,1,row,col,s);



    }
    private  static void print(int sr,int sc,int er,int ec,String s){

        if(sr>er || sc>ec ){
            return;
        }
        if(sr==er || sc==ec){
            System.out.println(s);
            return;
        }

        print(sr+1,sc,er,ec,s+"D");
        print(sr,sc+1,er,ec,s+"R");



    }
}
