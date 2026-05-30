package com.dsa.string;

public class NextgreaterElement {
    public static void main(String[] args) {
        String num = "10011";
        System.out.println("Binary representation of next number = "
                + nextGreater(num));
    }

    private static String nextGreater(String num) {
        int l = num.length();
        int i;
        for (i = l - 1; i >= 0; i--) {
            // if '0' is encountered, convert
            // it to '1' and then break
            if (num.charAt(i) == '0') {
                num = num.substring(0, i) + '1' + num.substring(i+1);
                break;
            } // else convert '1' to '0'
            else {
                num = num.substring(0, i) + '0' + num.substring(i + 1);
            }
            // num[i] = '0';
        }

        if (i < 0) {
            num = "1" + num;
        }
        return  num;
    }
}
