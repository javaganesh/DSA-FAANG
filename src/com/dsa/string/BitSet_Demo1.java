package com.dsa.string;

import java.util.BitSet;
import java.util.stream.IntStream;

public class BitSet_Demo1 {
    public static void main(String[] args) {
        BitSet init_bitset = new BitSet();
        init_bitset.set(40);
        init_bitset.set(25);
        init_bitset.set(31);
        init_bitset.set(100);
        init_bitset.set(121);
        init_bitset.set(400);
        init_bitset.set(2);
        init_bitset.set(15);
        init_bitset.set(106);
        init_bitset.set(55);

        System.out.println("BitSet: " + init_bitset);


        // Creating an IntStream
        IntStream indice_Stream = init_bitset.stream();

        // Displaying the working
        System.out.println("The BitSet: " + init_bitset);
        System.out.println("The stream of indices: "
                + indice_Stream);
        System.out.println("The size of the stream: "
                + indice_Stream.count());




    }
}
