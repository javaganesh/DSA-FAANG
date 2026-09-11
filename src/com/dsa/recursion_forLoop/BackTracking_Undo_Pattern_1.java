package com.dsa.recursion_forLoop;

import java.util.ArrayList;

public class BackTracking_Undo_Pattern_1 {
    static void solve(ArrayList<Integer> list, int start) {

        System.out.println(list);
        for(int i=start;i<=3;i++){
            list.add(i);
            solve(list,i+1);
            list.remove(list.size()-1);
        }

    }
    public static void main(String[] args) {
        solve(new ArrayList<>(), 1);

    }
}
