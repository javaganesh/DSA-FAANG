package com.dsa.recursion_forLoop;

public class Box3With {
    public  static  void solve(int box,String ans){

        if(box==2){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=3;i++){
            solve(box+1,ans+i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        solve(0,"");
    }
}
