package com.dsa.array;

public class MaximuSubarry {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7};
        int max=0;
        for(int i=0;i<= arr.length;i++){
            int sum=0;
            for(int j=i;j<i+3 && j< arr.length;j++){
                sum=sum+arr[j];
            }
            if(sum >max){
                max=sum;
            }

        }
        System.out.println(max);
    }
}
