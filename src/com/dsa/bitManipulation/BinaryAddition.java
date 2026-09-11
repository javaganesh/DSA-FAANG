package com.dsa.bitManipulation;

import java.util.Scanner;

public class BinaryAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Binary Number : ");
        String a = sc.next();

        System.out.print("Enter Second Binary Number : ");
        String b = sc.next();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);

            carry = sum / 2;
        }

        result.reverse();

        System.out.println("Binary Sum = " + result);

        sc.close();
    }
}