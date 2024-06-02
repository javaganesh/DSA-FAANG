package com.dsa.string;

import java.util.ArrayDeque;
import java.util.Deque;

public class RotationOfString {
    public static void main(String[] args) {
      String  str = "GeeksforGeeks";
      int postion=2;
    //  leftRotationOfString(str,postion );
    //  righRotationOfString(str,postion );
     //   System.out.println(leftrotate(str,2));
       // System.out.println(rightrotate(str,2));
        rightrotateUseDequue(str,2);

    }

    private static void rightrotateUseDequue(String str, int d) {
        Deque<Character> deque=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();

        for(char c:str.toCharArray()){
            deque.add(c);
        }
        for(int i=0;i<d;i++){
            deque.addLast(deque.removeFirst());
        }
        deque.forEach(e->{
            sb.append(e);
        });
        System.out.println(sb.toString());

    }

    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    // function that rotates s towards right by d
    static String rightrotate(String str, int d)
    {
        return leftrotate(str, str.length() - d);
    }


    private static void leftRotationOfString(String str,int postion) {
        StringBuilder sb=new StringBuilder();
        for(int index =postion;index<str.length();index++){
            sb.append(str.charAt(index));
        }
        for(int index=0;index<postion;index++){
            sb.append(str.charAt(index));
        }
        System.out.println(sb.toString());


    }
}
