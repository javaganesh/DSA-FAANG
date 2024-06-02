package com.dsa.array;

public class GFG {
    public static void main(String[] args) {

        // Input Matrix
        int[][] mat = new int[][] { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        GFG B_Values = new GFG();

        B_Values.Boundary_Elements(mat);
    }

    private void Boundary_Elements(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if (i == 0 || j == 0 || i == mat.length - 1
                        || j == mat[i].length - 1) {
                    System.out.print(mat[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
