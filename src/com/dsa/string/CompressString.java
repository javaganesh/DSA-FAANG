package com.dsa.string;

public class CompressString {

    public  static String compressStringwithCount(String str){
        String s=""+str.charAt(0);
        int count=1;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                if(count>1){
                    s+=count;
                }

                s+=str.charAt(i);
                count=1;
            }
            else{
                count++;
            }

        }
        return s;



    }
    public static String compressString(String str) {
        int n = str.length();
        String s = "" + str.charAt(0);

        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                s += str.charAt(i);
            }
        }
        return s;

    }

    public static void main(String[] args) {

        String str="aabbcccdddeaff";
      //  System.out.println(compressString(str));
        System.out.println(compressStringwithCount(str));

    }
}
