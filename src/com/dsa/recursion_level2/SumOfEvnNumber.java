package com.dsa.recursion_level2;

public class SumOfEvnNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        //System.out.println(evSum(arr,0));
        System.out.println(sumEven(arr,0));
        System.out.println(oddSum(arr,0));
    }

/*    private static int evSum(int[] arr, int idx) {
        if(idx> arr.length-1) return 0;

        int rm=evSum(arr,idx+1);
        if(arr[idx]%2==0){
            return arr[idx]+rm;
        }
        return rm;


    }*/
private static int sumEven(int[] arr, int idx) {

    if(idx == arr.length)
        return 0;

    int rem = sumEven(arr, idx + 1);

    if(arr[idx] % 2 == 0)
        return arr[idx] + rem;

    return rem;
}
    private static int oddSum(int[] arr, int idx) {
        if(idx> arr.length-1) return 0;

        int rm=oddSum(arr,idx+1);
        if(arr[idx]%2==1){
            return arr[idx]+rm;
        }
        return rm;


    }
}
