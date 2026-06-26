package com.dsa.recursion.level2;

public class AvrageOfElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int total = sum(arr, 0);

        double avg = (double) total / arr.length;

        System.out.println(avg);
    }

    private static int sum(int[] arr, int idx) {
        if(idx>=arr.length){
            return 0;
        }
        int resum=sum(arr,idx+1);
        return arr[idx]+resum;
    }
}
