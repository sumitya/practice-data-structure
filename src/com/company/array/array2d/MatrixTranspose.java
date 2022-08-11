package com.company.array.array2d;

import java.util.HashSet;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3,10},
                {4, 5, 6,20},
                {7, 8, 9,30}};

        int[][] A1 = {{21, 62, 16, 44, 55, 100, 16, 86, 29},
                {62, 72, 85, 35, 14, 1, 89, 15, 73},
                {42, 44, 30, 56, 25, 52, 61, 23, 54},
                {5, 35, 12, 35, 55, 74, 50, 50, 80},
                {2, 65, 65, 82, 26, 36, 66, 60, 1},
                {18, 1, 16, 91, 42, 11, 72, 97, 35},
                {23, 57, 9, 28, 13, 44, 40, 47, 98}};

        int[][] resArr = solve(A);
        for(int i = 0; i< resArr.length;i++) {
            for (int j = 0; j < resArr[0].length; j++) {
                System.out.print(resArr[i][j]);

            }
            System.out.println();
        }
    }

    public static int[][] solve(int[][] A) {

        int[][] resArr = new int[A.length][A[0].length];

        for(int i = 0; i< A.length;i++){
            for(int j = i; j< A[0].length;j++){
                System.out.println("upper A[i][j] => "+ A[i][j]);
                resArr[j][i]=A[i][j];
            }
        }

        for(int j = 0; j< A[0].length;j++){
            for(int i = j; i<A.length;i++){
                System.out.println("Lower A[i][j] => "+ A[i][j]);
                resArr[j][i]=A[i][j];
            }
        }

        return resArr;

    }
}
