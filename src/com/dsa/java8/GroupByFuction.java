package com.dsa.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByFuction {
    public static void main(String[] args) {
        List<Student> list = ListOfStudent.getListOfListofStudent();
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));

        System.out.println(map);
        Stream<Map.Entry<Integer, Long>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        System.out.println(sorted.collect(Collectors.toList()));
        Stream<Map.Entry<Integer, Long>> sorted1 = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByKey().reversed());


        sorted1.forEachOrdered(e->{
            System.out.println(e.getKey()+" "+e.getValue());

        });
        Map<String, Integer> ageCount = list.stream().
                collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getId)));

        System.out.println(ageCount);

        Map<String, List<Student>> nameGroup = list.stream().collect(Collectors.groupingBy(Student::getName));

        System.out.println("Namegrop:"+nameGroup);
        Map<String, Set<String>> uniqueName = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.mapping(Student::getName, Collectors.toSet())));

        System.out.println("uniqueName:"+uniqueName);
    }
}

