package com.dsa.recursion.subSet;

public class Main_6 {
    private static void generate(int n, String path) {
       if(path.length()==n){
           System.out.println(path);
           return;
       }

        generate(n,path+"a");
        generate(n,path+"b");
        generate(n,path+"c");
    }
    public static void main(String[] args) {
        generate(2, "");
    }


}
