package com.dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class WalamerTest {
    public static void main(String[] args) {
        int [] arr={34,3456,64,24,45,3,45,37,34};
        Arrays.stream(arr).
                mapToObj(element->element+"").
                filter(el->el.startsWith("3")).
                distinct().
                map(s->Integer.parseInt(s)).
                sorted(Comparator.reverseOrder()).
                forEach(el->{
                    System.out.println(el);
                });

        System.out.println( Arrays.stream(arr).skip(3).max().getAsInt()
               );



    }
}
