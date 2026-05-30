package com.dsa.dp;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (n <= 0) {
            return ans;
        }

        // Initialize the first row of Pascal's Triangle
        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        // Generate each row of Pascal's Triangle
        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = ans.get(i - 1);

            // First element of each row is always 1
            row.add(1);

            // Calculate the middle elements of the row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            row.add(1);

            // Add the constructed row to the result
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
