package com.dsa.recursion.basic;

/*
public class Main_21 {

    static int countOccurrences(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return 0;
        }

        // Current match or not
        int count = (arr[i] == target) ? 1 : 0;

        // Recursive call
        return count + countOccurrences(arr, i + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 8, 5};
        int target = 8;

        System.out.println(countOccurrences(arr, 0, target));
    }
}
*/

/*
public class Main_21 {

    static int countOccurrences(int[] arr, int i, int target) {

        if (i == arr.length) {
            return 0;
        }

        int res = countOccurrences(arr, i + 1, target);

        if (arr[i] == target) {
            return res + 1;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 8, 5};
        int target = 8;

        System.out.println(countOccurrences(arr, 0, target));
    }
}

*/
/*

public class Main_21 {

    static int countOccurrences(int[] arr, int i, int target) {

        // Base Case
        if (i == arr.length) {
            return 0;
        }

        // Current match or not
        int count = (arr[i] == target) ? 1 : 0;

        // Recursive call
        return count + countOccurrences(arr, i + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 8, 5};
        int target = 8;

        System.out.println(countOccurrences(arr, 0, target));
    }
}*/


/*
public class Main_21 {

    static int count = 0;

    static void countOccurrences(int[] arr, int i, int target) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == target) {
            count++;
        }

        countOccurrences(arr, i + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 8, 5};
        int target = 8;

        countOccurrences(arr, 0, target);

        System.out.println(count);
    }
}*/


public class Main_21 {

    // =========================
    // APPROACH 1: Return Based
    // =========================
    static int countMethod1(int[] arr, int i, int target) {

        if (i == arr.length) {
            return 0;
        }

        int count = (arr[i] == target) ? 1 : 0;

        return count + countMethod1(arr, i + 1, target);
    }

    // =========================
    // APPROACH 2: Global Variable
    // =========================
    static int count2 = 0;

    static void countMethod2(int[] arr, int i, int target) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == target) {
            count2++;
        }

        countMethod2(arr, i + 1, target);
    }

    // =========================
    // APPROACH 3: Backtracking Style
    // =========================
    static int countMethod3(int[] arr, int i, int target) {

        if (i == arr.length) {
            return 0;
        }

        int res = countMethod3(arr, i + 1, target);

        if (arr[i] == target) {
            return res + 1;
        }

        return res;
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 8, 5};
        int target = 8;

        // Method 1
        System.out.println("Method1: " + countMethod1(arr, 0, target));

        // Method 2
        countMethod2(arr, 0, target);
        System.out.println("Method2: " + count2);

        // Method 3
        System.out.println("Method3: " + countMethod3(arr, 0, target));
    }
}