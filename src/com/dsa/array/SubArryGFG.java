package com.dsa.array;

public class SubArryGFG {
    static int countSubarrays(int a[], int n, int x)
    {
        int count = 0;

        int number = 0;
        for(int i=0;i<n;i++){

            if (a[i] > x) {
                count += 1;
            }
            else {

                number += (count) * (count + 1) / 2;
                count = 0;
            }
        }
        if (count!=0)
            number += (count) * (count + 1) / 2;

        return number;
    }
    public static void main(String[] args) {
        int a[] = { 3, 4, 5, 6, 7, 2, 10, 11 };
        int n = a.length;
        int k = 5;

        System.out.println (countSubarrays(a, n, k));
    }
}
