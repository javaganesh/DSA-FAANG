package com.dsa.string;

import java.util.BitSet;

public class BitSetExample2 {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();

        bs1.set(7);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
        bs1.set(3);
        bs1.set(6);

        bs2.set(4);
        bs2.set(6);
        bs2.set(3);
        bs2.set(9);
        bs2.set(2);

        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);
        // use of length() method
        System.out.println("use of length() : " + bs1.length());

        bs1.xor(bs2);
        System.out.println("Use of xor() : " + bs1);
        bs2.xor(bs1);
        System.out.println("Use of xor() : " + bs2);

        bs2.clear(1, 2);
        System.out.println("bs2 after clear method : " + bs2);


        // Printing the Bitsets
        System.out.println("bs1         : " + bs1);
        System.out.println("bs2         : " + bs2);

        // use of get() to get index 3 to 6 of bs1
        System.out.println("\nUse of get() on bs1 : "
                + bs1.get(1,4));

        // use of get() to get index 1 to 4 of bs2
        System.out.println("Use of get() on bs2 : "
                + bs2.get(1,4));

        // perform not operation in b/w the sets
        bs1.andNot(bs2);
        System.out.println("\nNot b/w bs1 and bs2 : " + bs1);

        // perform and operation between two bitsets
        bs1.and(bs2);
        System.out.println("And b/w bs1 and bs2 : "  + bs1);

        // equal() method to compare the bs1 and bs2
        if (bs1.equals(bs2))
            System.out.println("\nUsing equal method : Equal");
        else
            System.out.println("\nUsing equal method : Not Equal");


    }
}
