package com.dsa.string;

public class StringReverseSwaptech {
    public static void main(String[] args) {
        String s = "i like this program very much";
        String[] words = s.split("\\s");
        words = RevString(words, words.length);
        s = String.join(" ", words);

        System.out.println(s);
    }

    private static String[] RevString(String[] words, int length) {

        // Check if number of words is even
    if(length/2==0){
        int j=length/2;
        while(j<=length-1){
            String temp;
            temp = words[length - j - 1];
            words[length - j - 1] = words[j];
            words[j] = temp;
            j += 1;
        }
       //if it is odd

    }
    else{
        int j = (length / 2) + 1;

        //Starting from the middle start
        // swapping the words at jth
        // position and l-1-j position
        while(j<length-1){
            String temp;
            temp = words[length - j - 1];
            words[length - j - 1] = words[j];
            words[j] = temp;
            j += 1;
        }
    }
        return words;
    }
}
