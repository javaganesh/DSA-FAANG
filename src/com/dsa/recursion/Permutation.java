package com.dsa.recursion;

public class Permutation {
    public static void main(String[] args) {
       String str="abc";
       //printPermitation(str,"");
        permute(str);

    }

    public static void permute(String str) {
        int n = str.length();
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = 0;
        }

        System.out.println(str); // Print the original string

        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                str = swap(str, i % 2 == 0 ? 0 : indexes[i], i);
                System.out.println(str);
                indexes[i]++;
                i = 0;
            } else {
                indexes[i] = 0;
                i++;
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    private static void printPermitation(String str,String pcn) {
       if(str.length()==0){
           System.out.println(pcn);
           return;
       }

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String leftPart=str.substring(0,i);
            String rightPart=str.substring(i+1);
            String rem=leftPart+rightPart;
            printPermitation(rem,pcn+c);

        }
    }
}
