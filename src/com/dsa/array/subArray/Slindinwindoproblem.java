package com.dsa.array.subArray;

public class Slindinwindoproblem {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        
        int currentySum=0;
        int i;
        for(i=0;i<n;i++){
            currentySum+=arr[i];
            if(currentySum>sum){
                break;
            }

        }
        for(int j=i;j<n;j++){
            currentySum+=arr[j]-arr[j-i];

            if(currentySum==sum){
                System.out.println("current sum with range:"+i +" between:"+j);
                for(int k=i;i<k;i++){
                    System.out.println(arr[k]);
                }

                return;

            }
            if(j==n){
                System.out.println("Not possible");
            }
        }
    }
}
