package com.company.DataStructuresOne.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat =   {{1,2},
                        {3,4}};
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] matNew = new int[r][c];
        int row = 0;
        int col = 0;
        if((mat.length * mat[0].length) != (r * c)) return mat;
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                matNew[row][col] = mat[i][j];
                col++;
                if(col==c){
                    col = 0;
                    row++;
                }
            }
        }
        return matNew;
    }
}
