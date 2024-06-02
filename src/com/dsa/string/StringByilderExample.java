package com.dsa.string;

public class StringByilderExample {
    public static void main(String[] args) {
        /*StringBuilder str = new StringBuilder();

        // add the String to StringBuilder Object
        str.append("Geek");

        int unicode = str.codePointAt(1);
        System.out.println("StringBuilder Object"
                + " contains = " + str);
        System.out.println("Unicode of Character"
                + " at Position 1 "
                + "in StringBuilder = "
                + unicode);

        unicode = str.codePointAt(3);

        // print the result
        System.out.println("Unicode of Character "
                + "at Position 3 "
                + "in StringBuilder = "
                + unicode);
*/
        StringBuilder
                str
                = new StringBuilder("WelcomeGeeks");

        // print string
        System.out.println("String is " + str.toString());

        // loop through string and print every Character
        for (int i = 0; i < str.length(); i++) {

            // get char at position i
            char ch = str.charAt(i);

            // get unicode of char at position i
            int unicode = str.codePointAt(i);

            // print char and Unicode
            System.out.println("Unicode of Char " + ch
                    + " at position " + i
                    + " is " + unicode);
        }

















    }
}
