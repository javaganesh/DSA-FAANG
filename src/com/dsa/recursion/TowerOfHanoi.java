package com.dsa.recursion;

public class TowerOfHanoi {

    public static void towerH(int n, int sc, int helper, int dest) {
        // Base condition
        if (n == 1) {
            System.out.println("Move disk " + n + " from source: " + sc + " to destination: " + dest);
            return;
        }

        // Recursive case: move n-1 disks from source to helper
        towerH(n - 1, sc, dest, helper);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from source: " + sc + " to destination: " + dest);

        // Move n-1 disks from helper to destination
        towerH(n - 1, helper, sc, dest);
    }

    public static void main(String[] args) {
        int n = 3;  // Number of disks
        int sc = 1;  // Source peg
        int helper = 2;  // Helper peg
        int dest = 3;  // Destination peg

        // Solve Tower of Hanoi
        towerH(n, sc, helper, dest);
    }
}
