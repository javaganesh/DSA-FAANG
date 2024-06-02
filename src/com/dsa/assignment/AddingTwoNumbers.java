package com.dsa.assignment;

public class AddingTwoNumbers {
    private static String add(String num1, String num2) {
        String n1 = num1.replaceAll(",", "");
        String n2 = num2.replaceAll(",", "");
        int maxLength = Math.max(n1.length(), n2.length());

        StringBuilder sb1 = new StringBuilder(n1);
        StringBuilder sb2 = new StringBuilder(n2);

        // add padding to n1
        if (maxLength > sb1.length()) {
            sb1.insert(0, '0');
        }
        // add padding to n2
        if (maxLength > sb2.length()) {
            sb2.insert(0, '0');
        }

        int carry = 0;
        // addition
        StringBuilder result = new StringBuilder();
        for (int i = maxLength - 1; i >= 0; i--) {
            int digit1 = sb1.charAt(i) - '0';
            int digit2 = sb2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        for (int i = result.length() - 3; i >= 0; i -= 3) {
            result.insert(i, ',');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "1";
        //String result = add(num1, num2);
        System.out.println(add(num1, num2));
    }
}
