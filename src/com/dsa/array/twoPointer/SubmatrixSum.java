package com.dsa.array.twoPointer;

public class SubmatrixSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},
                {6,7,8,9,10},
                {1,2,3,4,5},
                {6,7,8,9,10},
                {1,2,3,4,5},
                {6,7,8,9,10}

                        };

        int r1=1 ,c1=1;
        int r2= 4,c2=3;
           int sum=0;

        for(int i=r1;i<=r2;i++){
                for(int j=c1;j<=c2;j++){
            sum+=arr[i][j];
            }
        }

        System.out.println("sum:"+sum);
    }
}
    