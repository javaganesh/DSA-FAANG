package com.dsa.tes1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOfValueList {
    public static void main(String[] args) {
        Map<String, List<Integer>> map1=new HashMap<>();
        map1.put("Ganesh", Arrays.asList(1,3,4,5,6));
        map1.put("Nandu", Arrays.asList(10,20,30,40));
        map1.put("Ramesh", Arrays.asList(70,40,50,60,40,50,60));
        map1.put("Lushi", Arrays.asList(100,200,300,400));

      /*map.entrySet().stream().forEach(entry->{
          System.out.println(entry.getKey());
          List<Integer> valuesList = entry.getValue();
          Map<Integer, Long> insidmap = valuesList.stream().filter(e -> e > 3).
                  collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
          System.out.println(insidmap);
      });*/

        Map<String, List<Integer>> map2=new HashMap<>();
        map2.put("Ganesh", Arrays.asList(1,3,4,5,6));
        map2.put("Nandu", Arrays.asList(10,20,30,40));
        map2.put("Ramesh", Arrays.asList(70,40,50,60,40,50,60));
        map2.put("Lushi", Arrays.asList(100,200,300,400));


        List<Map<String, List<Integer>>> list=new ArrayList<>();
          list.add(map1);
          list.add(map2);
  /*       list.forEach(l->{
             l.entrySet().stream().forEach(e->{
                 System.out.println(e.getKey());
                 List<Integer> vales = e.getValue();
                 vales.stream().forEach(v->{
                     System.out.println(v);
                 });
             });

         });

*/
        Map<Stream<Integer>, Long> mapCollect = list.stream().
                map(l -> l.values().
                        stream().
                        flatMap(s -> s.stream())).
                collect(Collectors.
                        groupingBy(Function.identity(),
                                Collectors.counting()));


        mapCollect.entrySet().forEach(s->{

            s.getKey().forEach(k->{
                System.out.println(k);
            });
            System.out.println(s.getValue());

        });
    }
}
