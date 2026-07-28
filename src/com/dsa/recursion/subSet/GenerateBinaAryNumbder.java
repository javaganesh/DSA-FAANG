package com.dsa.recursion.subSet;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaAryNumbder {
    private static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        generate(5, "");
    }

    private static void generate(int n, String path) {
        if(n==path.length()){
            System.out.println(path);
            return;
        }

        generate(n,path+"0");
        generate(n,path+"1");
    }
}
