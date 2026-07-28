package com.dsa.recursion.subSet;

import java.util.ArrayList;
import java.util.List;

public class Soll1 {
    public static List<String> validStrings(int n) {

        List<String> result = new ArrayList<>();
        backTrack(n, "", result);
        return result;
    }

    private static void backTrack(int n, String path, List<String> result) {
        if(path.length()==n){
            result.add(path);
            return;
        }
        backTrack(n,path+"0",result);
        if(path.isEmpty()|| path.charAt(path.length()-1)!='1'){
            backTrack(n,path+"1",result);
        }

    }

    public static void main(String[] args) {
        System.out.println(Soll1.validStrings(3));
    }
}
