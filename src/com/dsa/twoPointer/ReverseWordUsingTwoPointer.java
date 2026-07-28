package com.dsa.twoPointer;

import java.util.Arrays;

public class ReverseWordUsingTwoPointer {

    private static String revserWordUsingTwopointer(String str) {
      int n=str.length();
      char[] charArray=str.toCharArray();
      reverse(charArray,0,charArray.length-1);
        System.out.println(Arrays.toString(charArray));
      int start=0;
      for(int end=0;end<=charArray.length;end++){
          if(end== charArray.length || charArray[end]== ' '){
           reverse(charArray,start,end-1);
           start=end+1;
          }
          ;
      }
      return  new String(charArray);

    }

    private static void reverse(char[] charArray, int left, int right) {

        while (left<right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        String str="Ganesh Chandra Parida";
        revserWordUsingTwopointer(str);
    }


}
