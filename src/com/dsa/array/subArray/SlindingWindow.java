package com.dsa.array.subArray;

public class SlindingWindow {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int currentSum=0;
            int z=0;
            for(int j=i;j<=arr.length;j++){
                currentSum+=arr[j];
                z++;
                if(k==z){
                    maxSum=Math.max(currentSum,maxSum);
                    break;
                }
            }

        }
        System.out.println(maxSum);
    }
}
