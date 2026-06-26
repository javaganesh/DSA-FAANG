package com.dsa.recursion.level2;

public class CountGretherThenX {
    private static int countGreaterThanX(int[] arr, int idx, int x) {
        if(idx>=arr.length) return 0;

        int remc= countGreaterThanX(arr,idx+1,x);
        if(arr[idx]> x)
           return  1+remc;
        else
            return remc;
    }

    private static int countGreaterThanXX(int[] arr, int idx, int x) {
        if(idx>=arr.length) return 0;

        /*if(arr[idx]==x){
           return  1+countGreaterThanX(arr,idx+1,x);
        }
        else
            return countGreaterThanX(arr,idx+1,x);*/

        return (arr[idx] > x ? 1 : 0)
                + countGreaterThanX(arr, idx + 1, x);
    }
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 18, 7, 20};
        int x = 10;
        System.out.println(countGreaterThanX(arr,0,x));
        System.out.println(countGreaterThanXX(arr,0,x));
    }
}
