package com.dsa.twoPointer;

public class ReverseFirstOccurance {
    private static void reverseFirstOccurance(String word, char ch) {
        char[] charArray=word.toCharArray();
        int fidx=-1;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==ch)
            {
                fidx=i;
                break;
            }

        }
        if(fidx==-1){
            return;
        }
        int left=0;
        int right =fidx;
        while(left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(charArray));
    }
    public static void main(String[] args) {
       String word = "abcdefd";
       char ch = 'd';
        System.out.println(word);
       reverseFirstOccurance(word,ch);
    }


}
