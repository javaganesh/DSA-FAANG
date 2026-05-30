package com.dsa.wipro;

public class StringWord {
    private static String printWordWithSpace(String str) {
        int leftidx = 0;
        int rightidx = 1;

        while (rightidx <= str.length()) {
            System.out.print(str.substring(leftidx, rightidx) + " ");
            leftidx = rightidx;
            rightidx++;
        }
        return "";




    }
    public static void main(String[] args) {

        String input = "coforgeBangloreIndia";
        String res=printWordWithSpace(input);
        System.out.println(res);

    }


}
