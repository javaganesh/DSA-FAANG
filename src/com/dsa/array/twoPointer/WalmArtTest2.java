package com.dsa.array.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WalmArtTest2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        String[] strArry = {"eat","tea","tan","ate","nat","bat"};

/*
        Map<String, List<String>> mapString = Arrays.stream(strArry).collect(Collectors.
                groupingBy(s -> s + "" + Arrays.toString(s.toCharArray())));
        System.out.println(mapString);
*/

          Arrays.sort(strArry);

       for(int i=0;i<strArry.length;i++){
           boolean flag=false;
           char[] charArrayI=strArry[i].toCharArray();
           Arrays.sort( charArrayI);
           int j;
           for(j=0;j<strArry.length;j++){
               char[] charArrayJ=strArry[j].toCharArray();
               Arrays.sort(strArry[j].toCharArray());

               if(i!=j && Arrays.equals(charArrayI,charArrayJ)){
                   list.add(i,strArry[i]+" "+strArry[j]);
                   flag=true;
                   break;
               }
           }

           }
        System.out.println(list);
       }



    }

