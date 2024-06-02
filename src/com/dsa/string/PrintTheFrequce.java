package com.dsa.string;

import java.util.HashMap;

public class PrintTheFrequce {
    static int MAX = 26;
    static void compressString(String s, int n)
    {
        int freq[] = new int[MAX] ;

        // Update the frequency array
        for (int i = 0; i < n; i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        // Print the frequency in alphatecial order
        for (int i = 0; i < MAX; i++)
        {

            // If the current alphabet doesn't
            // appear in the string
            if (freq[i] == 0)
                continue;

            System.out.print((char)(i + 'a') +""+ freq[i]);
        }
    }


    public static void main(String[] args) {
        String str= "aabccccddd";
       /* HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map.forEach((k,v)->{
            System.out.print(k+""+v);

        });*/
        compressString(str,str.length());
    }
}
