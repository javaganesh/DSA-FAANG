package com.dsa.recursion.level2;

public class FindLastEvnNumber {
    private static int findLastEvenNumber(int[] arr, int idx) {
        if(idx==arr.length) return -1;

        int rm=findLastEvenNumber(arr,idx+1);

        return rm!=-1? rm: arr[idx]%2==0?idx : -1;

    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 10,23,22,24,25,27,33,37};

        System.out.println( findLastEvenNumber(arr,0));
        System.out.println( findLastOddNumberIdx(arr,0));
        System.out.println( findLastOdd(arr,0));
    }

    private static int findLastOdd(int[] arr, int idx) {

        if(idx == arr.length)
            return -1;

        int rem = findLastOdd(arr, idx + 1);

        if(rem != -1)
            return rem;

        if(arr[idx] % 2 != 0)
            return idx;

        return -1;
    }
    private static int findLastOddNumberIdx(int[] arr, int idx) {
        if(idx==arr.length) return -1;

        int rm=findLastOddNumberIdx(arr,idx+1);
        if(rm!=-1)
            return rm;
        if(arr[idx]%2!=0) return idx;
        else  return -1;

    }


}
