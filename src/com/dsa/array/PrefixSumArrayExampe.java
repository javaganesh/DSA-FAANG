package com.dsa.array;

import java.util.Scanner;

public class PrefixSumArrayExampe {

 public static  boolean equalPartion(int[] arr){
      int totalsum=findTotalSumofArrayelemt(arr);
      int prexsume=0;
      for(int i=0;i<arr.length;i++){
          prexsume+=arr[i];
          int suffixsum=totalsum-prexsume;
          if(prexsume==suffixsum){
              return  true;
          }
      }
      return  false;
 }

    private static int findTotalSumofArrayelemt(int[] arr) {
     int total=0;
     for(int i=0;i<arr.length;i++){
          total+=arr[i];
      }
     return total;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        printArry(arr);
        System.out.println("===========================");
        int[] prefixSumarr=prefixSumArrayWithextravariable(arr);
        printArry(prefixSumarr);
        System.out.println("===========================");
        int[] prefixarry=prefixSumArrayWithout(arr);
        printArry(prefixarry);
        System.out.println("Enter how many queery :");
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- >0){
            System.out.println("Enter the raange");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=prefixSumarr[r]-prefixSumarr[l-1];
            System.out.println("print:"+ans);
        }

    }

    private static void printArry(int[] arr) {
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

    }

    private static int[] prefixSumArrayWithextravariable(int[] arr) {
        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }


        return prefixSum;

    }

    private static int[] prefixSumArrayWithout(int[] arr) {
       arr[0]=arr[0];
       for(int i=1;i< arr.length;i++){
           arr[i]=arr[i]+arr[i-1];
       }



        return arr;
    }
}
