package com.dsa.backTracking1;

public class CountSubSequncy {
    static int countSubsequence(
            String str,
            String target,
            int i,
            int j) {
       //all charter match
        if(j==target.length()){
            return 1;
        }
        if(i==str.length()){
            return 0;
        }
        if(str.charAt(i)==target.charAt(j)){
            //take
            int take=countSubsequence(str,target,i+1,j+1);
            int skip=countSubsequence(str,target,i+1,j);

            return take+skip;

        }
     return  countSubsequence(str,target,i+1,j);



    }
    public static void main(String[] args) {

    }
}
