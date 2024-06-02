package com.dsa.string;

public class RemoveAllOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
     //   removeChar(s, 'e');
        //removeChar1(s, 'e');
        removeCharUsingreplace(s, 'e');

    }

    private static void removeChar(String s, char c) {
        /*StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                continue;
            }
            sb.append(s.charAt(i));
        }*/


        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb.toString());
    }
    static void removeChar1(String s, char c)
    {
        int j, count = 0, n = s.length();
        char []t = s.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != c){
                t[j++] = t[i];
            }
            else{
                count++;
            }
        }
        while(count > 0)
        {
            t[j++] = ' ';
            count--;
        }

        System.out.println(t);
    }

    public static void removeCharUsingreplace(String str,char c){
        str=str.replace(Character.toString(c), "");
        System.out.println(str);
    }
}
