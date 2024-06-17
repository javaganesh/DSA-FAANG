package com.dsa.recursion;

import com.project.Book;

public class CheckForPallndromeUsingRecusrsion {
    private static boolean checkPaalndrom(String str,int n,int idx) {

        if(idx>n/2){
            return true;
        }
        if(str.charAt(idx)!=str.charAt(n-idx-1)){
            return false;
        }

      return   checkPaalndrom(str,n,idx+1);
    }

    public static void main(String[] args) {
        String str = "madlam";
        System.out.println(  checkPaalndrom(str,str.length(),0));
    }


}
