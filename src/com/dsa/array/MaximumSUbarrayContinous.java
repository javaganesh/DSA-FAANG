package com.dsa.array;

public class MaximumSUbarrayContinous {
    public static void main(String[] args) {
        int[] arr={4,-6,2,8};
        int maximum=maximumSubarray(arr);
        System.out.println(maximum);

        int maximum1=maximumSubarray1(arr);
        System.out.println(maximum1);

    }

    private static int maximumSubarray1(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int prifix=0;
        for(int i=0;i<arr.length;i++){
            prifix+=arr[i];
            if(prifix<0){
                prifix=0;
            }
            max=Math.max(prifix,max);
        }
        return max;
    }

    private static int maximumSubarray(int[] arr) {
        int n=arr.length;
        int max=0;

        for(int i=0;i<n;i++){
            int prefix=0;
            for(int j=i;j<n;j++){
             prefix=prefix+arr[j];
            }
            max=Math.max(prefix,max);
        }
        return max;


    }
}
