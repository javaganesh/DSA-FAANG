package com.dsa.recursion_level2;

public class CountOcurance {
    public static int count=0;
    static void count1(int[] arr, int idx, int target) {
        if(idx==arr.length){
            return ;
        }
        if(arr[idx]==target){
            count++;
        }
        count1(arr,idx+1,target);




    }
    static int count(int[] arr, int idx, int target) {

        if(idx == arr.length)
            return 0;

        int countInRemaining = count(arr, idx + 1, target);

        if(arr[idx] == target)
            return 1 + countInRemaining;

        return countInRemaining;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 20};
        int target = 20;
       // System.out.println(countOccurrence(arr,0,target));
        count1(arr,0,target);
        System.out.println(count);
    }

    private static int countOccurrence(int[] arr, int idx, int target) {

        if(idx == arr.length)
            return 0;

        int remain = countOccurrence(arr, idx + 1, target);

        if(arr[idx] == target)
            return 1 + remain;

        return remain;
    }
}
