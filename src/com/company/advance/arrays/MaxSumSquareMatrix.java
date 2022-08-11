package com.company.advance.arrays;

import java.util.Arrays;

public class MaxSumSquareMatrix {
    public static void main(String[] args) {
        int[][] A  = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 8, 6, 7, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5}
        };

        solve(A,3);
    }
    public static int solve(int[][] A, int B) {
        int gMax = Integer.MIN_VALUE;
        int[][] prefixSumMatrix = createPrefixSumMatrix(A);
        for(int[] array: prefixSumMatrix){
            System.out.println(Arrays.toString(array));

        }
        for(int i = 0;i < A.length-B;i++) {
            for(int j = 0; j<A[0].length-B;j++) {
                int k = i + B;
                int l = j + B;
                int sum = prefixSumMatrix[k][l];
                if(i > 0) sum = sum - prefixSumMatrix[i-1][l];
                if(j > 0) sum = sum - prefixSumMatrix[k][j-1];
                if(i > 0 && j > 0) sum = sum + prefixSumMatrix[i-1][j-1];

                if(sum > gMax) gMax = sum;

            }
        }
        return gMax;
    }
    public static int[][] createPrefixSumMatrix(int[][] A){
        int[][] prefixSumMatrix = new int[A.length][A[0].length];
        // create prefix sum of row and column.
        prefixSumMatrix[0][0] = A[0][0];
        for(int j = 1 ; j <A[0].length;j++) prefixSumMatrix[0][j] = A[0][j] + prefixSumMatrix[0][j-1];
        for(int i = 1 ; i <A.length;i++) prefixSumMatrix[i][0] = A[i][0] + prefixSumMatrix[i-1][0];

        for(int i = 1; i<A.length;i++){
            for(int j = 1; j<A[0].length;j++){
                prefixSumMatrix[i][j] =
                        A[i][j] + prefixSumMatrix[i-1][j] + prefixSumMatrix[i][j-1] - prefixSumMatrix[i-1][j-1];
            }
        }
        return prefixSumMatrix;
    }
}

