package com.dsa.string;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringSplitExample {
    public static void main(String[] args) {
        String str="+91-84560-18-636";

        List<String> list =Pattern.compile("-").splitAsStream(str).collect(Collectors.toList());
       /* list.forEach(li->{
            System.out.println(li);
        });*/
      //  list.toArray();



        StringTokenizer tokenizer=new StringTokenizer(str,"-");
        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextToken());
        }



    }
}
