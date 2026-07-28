package com.dsa.array.twodarray;

public class PrintSnke {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,13}};
        for(int i=0;i< arr.length;i++){
            if(i%2==0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
              for(int j=arr[i].length-1;j>=0;j--){
                  System.out.print(arr[i][j]+" ");
              }
            }
            System.out.println();
        }
        System.out.println("================================");
        System.out.println("=============Original matrix===================");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("=============transapose matrix===================");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;


            }
            System.out.println();
        }
        System.out.println(arr);
    }

}
