package com.dsa.string;

import java.util.BitSet;

public class BitSet_Demo {
    public static void main(String[] args) {
        BitSet init_bitset = new BitSet();
        init_bitset.set(40);
        init_bitset.set(25);
        init_bitset.set(31);
        init_bitset.set(100);
        init_bitset.set(53);

        // Displaying the BitSet
        System.out.println("BitSet: " + init_bitset);

        // Displaying the size
        System.out.println("The size is: "
                + init_bitset.size());






    }
}
