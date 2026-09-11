package com.dsa.backtracking;

public class ReCursionInside_For_Loop {
    public static void solve(int n){
        if(n<=0)
            return;
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //System.out.println(n);
        solve(n-1);

    }
    public static void main(String[] args) {
        solve(5);
    }
}
