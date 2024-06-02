package com.dsa.array;

public class Sprialmatrix {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5,6},
                {18,19,20,21,22,7},
                {17,28,29,30,23,8},
                {16,27,26,25,24,9},
                {15,14,13,12,11,10}
                 };

  int top=0; int bot= arr.length-1; int left=0; int right=arr[0].length-1;
  //first row
      while(left<=right && top<=bot){

          for(int col=left; col<right;col++){
              System.out.print(arr[top][col]+" ");
          }
          //right colum;
          for(int row=top; row<bot;++row){
              System.out.print(arr[row][right]+" ");
          }
          //print bottom
          for(int col=right;col>left; --col){
              System.out.print(arr[bot][col]+" ");
          }

          for(int row=bot;row>top; --row){
              System.out.print(arr[row][left]+" ");
          }
        left++;
          right--;
          top++;
          bot--;


      }


    }
}
