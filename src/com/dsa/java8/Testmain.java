package com.dsa.java8;

import java.util.*;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Testmain {
    public static void main(String[] args) {
      /* List<Student> list =ListOfStudent.getListOfListofStudent();
        System.out.println(list.stream().allMatch(s->s.getName().equals("Ganesh")));
        System.out.println(list.stream().anyMatch(s->s.getName().equals("Ganesh")));
        System.out.println(list.stream().noneMatch(s->s.getId()==108));
        System.out.println(list.stream().noneMatch(s->s.getId()==101));
        System.out.println( list.stream().filter(student -> student.getAge()>10).count());
        int[] arr={1,2,2,3,5,6,7,9};
        System.out.println( List.of(arr).stream().distinct().collect(Collectors.toList()).size());

        //find any
        List<String> stringList=Arrays.asList("AA","BB","CC","DD","AA");
        if(stringList.stream().anyMatch(s->s.contains("AA"))){
            System.out.println(stringList.stream().filter(s -> s.contains("AA")).count());
            System.out.println(stringList.stream().filter(s -> s.contains("AA")).findAny().get());

        }
        else {
            System.out.println("Not match");
        }
*/
        /*List<String> stringList=Arrays.asList("AA","BB","CC","DD","AA");

        stringList.stream().filter(s -> s.contains("AA")).findAny().orElse("Null");
        stringList.stream().filter(s -> s.contains("AA")).findAny().ifPresent(s->System.out.println(s));
*/

        /*IntStream  distrStream = IntStream.of(1, 2, 3, 4, 4, 5, 6, 6).distinct();
        distrStream.forEach(s->{
            System.out.println(s);
        });*/

//        List<Student> stdlist = ListOfStudent.getListOfListofStudent();
        /*Optional<Student> optional = stdlist.stream().max(Comparator.comparing(Student::getAge));
        System.out.println(optional.get().getName());
        Optional<Student> minoptional = stdlist.stream().min(Comparator.comparing(Student::getAge));
        System.out.println(minoptional.get().getName());
        */

       /* List<Student> stdlist = ListOfStudent.getListOfListofStudent();
        Student student =stdlist.stream().findFirst().get();
        System.out.println(student.getName());
        Student student1 =stdlist.stream().filter(s->s.getName().contains("Na")).findFirst().get();
        System.out.println(student1.getName());
*/

        /*List<Integer> lista=List.of(1,2,3,5);
        List<Integer> listb=List.of(5,6,7,8);

        List<List<Integer>> listab=new ArrayList<>();
        listab.add(lista);
        listab.add(listb);

        List<Integer> result = listab.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList());
        System.out.println(result);
*/
/*
        Stream<String[]> data1=Stream.of(new String[][]{{"B","Banana"},{"C","Carrete"},{"A","Apple"}});
        Stream<String[]> data2=Stream.of(new String[][]{{"P","Papaya"},{"L","Lemon"},{"G","Graps"}});
        Stream<Stream<String[]>>data3 =Stream.of(data1,data2);

          data3.forEach(x->{
              x.forEach(y->{
                  System.out.println(y[0]+" "+y[1]);
              });
          });

*/

        /*ToDoubleFunction<Integer> toDoubleFunction=a->Double.valueOf(a);

        List<Integer> lista=List.of(1,2,3,5);
        List<Integer> listb=List.of(5,6,7,8);
        List<List<Integer>> listc=new ArrayList<>();
        listc.add(lista);
        listc.add(listb);
        DoubleStream  doubleStream = listc.stream().flatMapToDouble(l -> l.stream().mapToDouble(a -> Double.valueOf(a)));
            doubleStream.forEachOrdered(d->{
                System.out.println(d);
            });
*/

/*
        List<String> lstr=List.of("1","2","3","5");

        DoubleStream  stringtodubleStream = lstr.stream().flatMapToDouble(a -> DoubleStream.of(Double.parseDouble(a)));
            stringtodubleStream.forEach(d->{
                System.out.println(d);
            });
*/


        /*List<String> lstr=List.of("1","2","3","5");
          lstr.stream().forEach(s->{
              System.out.println(s);
          });
        System.out.println("=====================");
        lstr.stream().parallel().forEach(s->{
            System.out.println(s);
        });
        */



/*
        IntStream.rangeClosed(1,20).forEach(s->{

            if(s%2==0){
                System.out.println(s);
            }
        });

        System.out.println("=================================");

        IntStream.rangeClosed(1,20).forEach(s->{
            System.out.println(s);

        });

        System.out.println("========forEachOder=============================");

        List<String> lstr=List.of("1","2","3","5");
        lstr.stream().parallel().forEachOrdered(s->{
            System.out.println(s);
        });

*/


     /*List<String> list=Arrays.asList("AA","BB","CC","DD","EE","FF");
        Optional<String> reduce = list.stream().reduce((st1, st2) -> {
            return st1.concat("-").concat(st2);
        });

        System.out.println(reduce.get());
*/
        List<String> lstr=List.of("1","2","3","5");
        Optional<String> reduce1 = lstr.stream().reduce((x,y)->x+y);
        Optional<String> reduce2 = lstr.stream().reduce(String::concat);
        System.out.println(reduce2);


        List<Integer> lntlist=List.of(1,2,3,4,5,6);
        Integer  sum = lntlist.stream().reduce(1, Integer::sum);
        System.out.println("sum:"+sum);


        System.out.println("===========================================");
        List<Integer>  integerList=List.of(1,2,3,4,5,6);
        Integer max = lntlist.stream().reduce(1, Integer::sum, Integer::max);
        System.out.println("max:"+max);


    }
}
