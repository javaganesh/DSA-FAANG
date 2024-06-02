package com.dsa.array.subArray;

public class GivenSubArrywhoseElemntiSgrtK {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 2, 10, 11}, k= 5;

        sumisGivenk(arr,k);
    }

    private static int sumisGivenk(int[] arr, int k) {
        int count = 0;

        int number = 0;

        for(int i=0;i< arr.length;i++){
        // greater than X or not

        if (arr[i] > k) {
            count += 1;
        }
        else {
            number += (count) * (count + 1) / 2;
            count = 0;
        }
    }
        return  number;
    }
}
