package com.dsa.hash.easy;

import java.util.Arrays;

public class disjointSet {
     static boolean aredisjoint(int set1[], int set2[])
    {
        int i=0,j=0;

        // Sort the given two sets
        Arrays.sort(set1);
        Arrays.sort(set2);
       while(i<set1.length && j<set2.length){
           if(set1[i]<set2[j]){
               i++;
           }
           else  if(set1[i]>set2[j]){
               j++;
           }
           else{
               return false;
           }
       }

        return true;
    }
    public static void main(String[] args) {
        int set1[] = { 12, 34, 11, 9, 3 };
        int set2[] = { 7, 2, 1, 5 };

        boolean result = aredisjoint(set1, set2);
        if (result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
