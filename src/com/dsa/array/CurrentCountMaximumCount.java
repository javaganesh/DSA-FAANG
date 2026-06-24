package com.dsa.array;

public class CurrentCountMaximumCount {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,2,2,2,3,3};
        countmaxiumOccirance(arr);
    }

    private static void countmaxiumOccirance(int[] arr) {
        int ccout=1;
        int maxCount=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]==arr[i-1]){
                ccout++;
            }
            else {

                ccout=1;
            }
            maxCount =Math.max(ccout,maxCount);

        }
        System.out.println(maxCount);
    }

}
