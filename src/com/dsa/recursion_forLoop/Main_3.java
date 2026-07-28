package com.dsa.recursion_forLoop;

public class Main_3 {
    public  static  void solve(int level,String ans){
        if(level==2){
            System.out.println(ans);
            return;
        }

         for(int i=0;i<=2;i++){
             System.out.println("start i:"+i);
             solve(level+1,ans+i);
             System.out.println("i  pause with level to resume:"+i+" level :"+level);
         }
    }
    public static void main(String[] args) {
        solve(0,"");
    }
}
