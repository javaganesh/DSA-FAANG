package com.dsa.string;

import java.util.BitSet;

public class ChecBinaryString {
    public static String nextGreaterElem(String num){

        BitSet b = new BitSet(32);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                b.set(num.length() - 1 - i);
            }
        }
        long n = b.toLongArray()[0];

        // Increment integer by 1
        n++;

        // Convert long back to binary string
        String result = Long.toBinaryString(n);

        // Remove leading zeros
        result = result.replaceFirst("^0+(?!$)", "");

        return result;

    }
    public static void main(String[] args) {
        String num = "10011";
        System.out.println("Binary representation of next number = " + nextGreaterElem(num));

    }
}
