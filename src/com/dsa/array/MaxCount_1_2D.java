package com.dsa.array;

public class MaxCount_1_2D {
    public static void main(String[] args) {
        int[][] arr={{1,0,1,0},
                {1,1,1,1},
                {0,0,1,1}};
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<arr.length;i++){
           int  cout=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    cout++;
                    if(max<cout){
                        max=cout;
                        idx=i;

                    }
                }
            }
        }
        System.out.println(idx+" "+max);
    }
}
