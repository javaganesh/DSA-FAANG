package com.dsa.string;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet(8);
        BitSet bs3 = new BitSet();

        bs1.set(0);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);

        bs2.set(4);
        bs2.set(6);
        bs2.set(5);

        bs3 = (BitSet) bs1.clone();

        // Printing the 3 Bitsets
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);
        System.out.println("bs3 cloned from bs1 : " + bs3);

        // elements of Bitset
        System.out.println("Cardinality of bs1 : " +
                bs1.cardinality());
        System.out.println("Cardinality of bs2 : " +
                bs2.cardinality());

    }
}
