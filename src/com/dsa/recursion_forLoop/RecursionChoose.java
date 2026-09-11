package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionChoose {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        solve(list);
    }

    private static void solve(List<Integer> list) {

        if(list.size()==2){
            System.out.println(list);
            return;
        }
        for (int i=1;i<=2;i++){
            list.add(i);
            solve(list);
            list.remove(list.size()-1);
        }

    }
}
