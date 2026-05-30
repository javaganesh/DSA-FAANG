package com.dsa.string;

import java.util.BitSet;

public class BitsetExampleDemo {
    public static void main(String[] args) {
        // Creating an empty BitSet
        BitSet init_bitset = new BitSet();

        // Use set() method to add elements into the Set
        init_bitset.set(10);
        init_bitset.set(20);
        init_bitset.set(30);
        init_bitset.set(40);
        init_bitset.set(50);

        // Displaying the BitSet
        System.out.println("BitSet: " + init_bitset);


        byte[] arr = init_bitset.toByteArray();
        System.out.println("The byteArray is: " + arr);

        // Displaying the byteArray
        System.out.println("The elements in the byteArray :");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
    }
}
