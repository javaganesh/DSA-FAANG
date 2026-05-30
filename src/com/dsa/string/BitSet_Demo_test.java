package com.dsa.string;

import java.util.BitSet;
import java.util.stream.IntStream;

public class BitSet_Demo_test {
    public static void main(String[] args) {
        BitSet init_bitset = new BitSet();
        init_bitset.set(10);
        init_bitset.set(20);
        init_bitset.set(30);
        init_bitset.set(40);
        init_bitset.set(50);

        System.out.println("BitSet: " + init_bitset);
        IntStream indice_Stream = init_bitset.stream();

        System.out.println("The BitSet: " + init_bitset);
        System.out.println("The stream of indices: "
                + indice_Stream);

        System.out.println("The size of the stream: "
                + indice_Stream.count());

    }
}
