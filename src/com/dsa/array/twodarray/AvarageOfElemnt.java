package com.dsa.array.twodarray;

public class AvarageOfElemnt {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum=0;
      for(int i=0;i< arr.length;i++){
          for(int j=0;j< arr[i].length;j++){
              sum+=arr[i][j];
          }
      }
      int tl=arr.length*arr[0].length;
      float avg=(float) (sum/tl);
        System.out.println(avg);
        System.out.println(tl);
        System.out.println(arr.length);
    }
}
