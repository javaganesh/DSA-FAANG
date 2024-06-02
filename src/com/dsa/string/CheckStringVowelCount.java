package com.dsa.string;

public class CheckStringVowelCount {
    public static void main(String[] args) {
        String str="Ganesh Chandra Parida";
        int vowelCount=0;
        int constantCount=0;

        for(int i=0;i<str.length();i++){
            if(checkVowelCont(str.charAt(i))){
                vowelCount++;
            }
            else {
                constantCount++;
            }


        }
        System.out.println(vowelCount);
        System.out.println(constantCount);
    }

    private static boolean checkVowelCont(char ch) {
       if(ch== 'A' || ch=='a' || ch=='e' || ch=='E' || ch=='i'|| ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
           return true;
       }
       else {
           return false;
       }
    }
}
