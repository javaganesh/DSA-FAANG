package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StramOfStream {
    public static void main(String[] args) {
        String[][] d = { { "A", "Apple" }, { "B", "Banana" }, { "O", "Orange" } };
        Stream<String[]> data1 =
                Stream.of(new String[][] { { "A", "Apple" }, { "B", "Banana" }, { "O", "Orange" } });

        Stream<String[]> data2 =
                Stream.of(new String[][] { { "P", "Papaya" }, { "C", "Coconut" }, { "O", "Orange" } });


        Stream<Stream<String[]>> data3 = Stream.of(data1, data2);
        data3.forEach(x->{

            x.forEach(y->{
           //     System.out.println(y[0]+" "+y[1]);
            });
        });
//////////////////////////////////////////
        List<Integer> list1 = Arrays.asList(20, 11, 28, 54, 51);

        list1.stream();

        List<Integer> list2 = Arrays.asList(10, 11, 15, 14, 25);

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        list.add(list1);
        list.add(list2);

        list.stream().flatMap(l->l.stream().map(x->x+10)).forEach(x->{
          //  System.out.println(x);
        });




    }
}
