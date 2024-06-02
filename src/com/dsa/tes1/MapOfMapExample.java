package com.dsa.tes1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOfMapExample {
    public static void main(String[] args) {
        Map<String,Map<String,Integer>> map=new HashMap<>();
        Map<String,Integer> btechMap=new HashMap<>();
        btechMap.put("BE",101);
        btechMap.put("TH",102);
        btechMap.put("BEC",103);
        btechMap.put("TOC",104);

        Map<String,Integer> mcaMap=new HashMap<>();
        mcaMap.put("dbms",101);
        mcaMap.put("os",103);
        mcaMap.put("compile",103);
        mcaMap.put("nerwoking",104);
        map.put("btechmap",btechMap);
        map.put("mcahmap",mcaMap);

        Set<Map.Entry<String, Map<String, Integer>>> entries = map.entrySet();

/*
    for(Map.Entry<String, Map<String, Integer>> entry:entries){
        System.out.println(entry.getKey());
          for(Map.Entry<String,Integer > ent :entry.getValue().entrySet()){
              System.out.println(ent.getKey()+ " "+ent.getValue());
          }
*/


        map.entrySet().stream() // Stream the outer map's entries
                .forEach(entry -> {
                    System.out.println(entry.getKey()); // Print the key of the outer map (programKey)
                    entry.getValue().entrySet().stream() // Stream the inner map's entries
                            .forEach(innerEntry -> {
                                System.out.println(innerEntry.getKey() + " " + innerEntry.getValue()); // Print the key-value pairs of the inner map
                            });
                });


    }

    }

