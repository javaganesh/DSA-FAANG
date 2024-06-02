package com.dsa.tes1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AccoliteDigital3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,3,5,3,6,4,10,11,2);
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> Unseen=new HashSet<>();
       /* for (int e:list){
            if (seen.contains(e)){
                Unseen.add(e);
            }
            seen.add(e);
        }*/


      list.stream().filter(el-> !seen.add(el)).forEach(e->{
          System.out.println(e);
      });
/*

        List<Integer> list2 = Arrays.asList(10,11,23,14,51,16,101);
        List<String> filterOne = list2.stream().map(el -> String.valueOf(el)).
                filter(el -> el.startsWith("1")).collect(Collectors.toList());

        System.out.println( filterOne.stream().map(el->Integer.parseInt(el)).collect(Collectors.toList()));
*/

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true













    }
}
