package com.dsa.array;

public class ArrayRotatio {

    public static int[] circularly(int[] arr,int d){
        int j=0;
        int i=0;
        while (j<d){

              int temp=arr[0];

            for(i=0;i< arr.length-1;i++){

                arr[i]=arr[i+1];

            }
            arr[arr.length]=temp;
            j++;
        }
       return  arr;
    }
    public static int[] rotatedArry(int[] arr,int d){
        if(arr.length==0 && d< arr.length){
            throw new IllegalArgumentException("operation can not be possible");
        }
        int siz= arr.length;
        int[] temp=new int[siz];
        int k=0;
        for(int i=d; i<siz;i++){
            temp[k++]=arr[i];
        }
        for(int i=0;i<d;i++){
            temp[k++]=arr[i];
        }
        return  temp;

    }
    public static void main(String[] args) {

        for(int i:rotatedArry(new int[]{1, 2, 3, 4, 5, 6,7,8,9}, 3)){
            System.out.print(i+"\t");

        }
        System.out.println("================================");

        for(int i:circularly(new int[]{1, 2, 3, 4, 5, 6,7,8,9}, 3)){
            System.out.print(i+"\t");

        }

    }
}
