package com.dsa.string;

public class IndexOfExample2 {
    public static void main(String[] args) {
       /* String s1 = "This is indexOf method";
        // Passing Substring
        int index = s1.indexOf("method"); //Returns the index of this substring
        System.out.println("index of substring "+index);
*/
        String s1 = "This is indexOf method";


        int index = s1.indexOf("method", 10); //Returns the index of this substring
        System.out.println("index of substring "+index);

        index = s1.indexOf("method", 20); // It returns -1 if substring does not found
        System.out.println("index of substring "+index);
    }
}
