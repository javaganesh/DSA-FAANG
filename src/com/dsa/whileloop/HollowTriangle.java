package com.dsa.whileloop;

public class HollowTriangle {

    public static void main(String[] args) {

        int totalRow = 5;

        int row = 1;

        while(row <= totalRow){

            int col = 1;

            while(col <= row){

                if(col == 1 || col == row || row == totalRow){

                    System.out.print("* ");

                }else{

                    System.out.print("  ");
                }

                col++;
            }

            System.out.println();

            row++;
        }
    }
}