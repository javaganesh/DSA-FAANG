package com.dsa.array.twoPointer;

import java.util.Arrays;

public class FindFourElementsThatSumtoagivenvalue {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 4, 5, 9, 7, 8};
        int  X = 23;
       Arrays.sort(array);
        int l, r;
       for(int i=0;i< array.length-3;i++){
           for(int j=i+1;j< args.length-2;j++){
               l=j+1;
               r= array.length-1;
               while (l<r){
                   if (array[i] + array[j] + array[l] + array[r] == X)
                   {
                       System.out.println(array[i]+" "+array[j]+" "+array[l]+" "+array[r]);
                       l++;
                       r--;
                   }
                   else if (array[i] + array[j] + array[l] + array[r] < X)
                       l++;
                   else // A[i] + A[j] + A[l] + A[r] > X
                       r--;
               }
           }
       }

    }
}
