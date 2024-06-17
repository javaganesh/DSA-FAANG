package com.dsa.recursion;

public class GetSubStringInRecusrsion {
    public static void main(String[] args) {
        String result=getSubString("abc");
        System.out.println(result);
    }

    private static String getSubString(String abc) {
        if(abc.isEmpty()){
            return "";
        }
       char fir =abc.charAt(0);
       String rest=getSubString(abc.substring(1));

       String res="";
       for(String c:res.split("",-1)){
           res +=fir+","+c;
       }
       return res;
    }

}
