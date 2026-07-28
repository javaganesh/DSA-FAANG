package com.dsa.recursion.subSet;

public class Main_6_1 {
    public static void main(String[] args) {
        generate(2,"");
    }

    private static void generate(int n, String path) {
          if(path.length()==n){
              System.out.println(path);
              return;
          }

        char[] choices = {'a', 'b', 'c'};
        for(char c:choices){
            generate(n,path+c);
        }
    }
}
