package com.company.advance.arrays2d;

import java.util.Arrays;

public class SubMatrixSumQueries {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[] B = {1,2};
        int[] C = {1,2};
        int[] D = {2,3};
        int[] E = {2,3};
        solve(A,B,C,D,E);
    }
    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        int[][] prefixSumMatrix = createPrefixSumMatrix(A);
        for(int[] arr : prefixSumMatrix) System.out.println(Arrays.toString(arr));

        int[] result = new int[B.length];
        for(int i=0; i < B.length; i++) {
            int a1 = B[i] - 1;
            int b1 = C[i] - 1;
            int a2 = D[i] - 1;
            int b2 = E[i] - 1;
            int sum = prefixSumMatrix[a2][b2];

            if(a1 > 0) {sum -= prefixSumMatrix[a1-1][b2];}
            if(b1 > 0) {sum -= prefixSumMatrix[a2][b1-1];}
            if(a1 > 0 && b1 > 0) {sum += prefixSumMatrix[a1-1][b1-1];}

            result[i] = findMod(sum);

        }
        return result;
    }

    public static int[][] createPrefixSumMatrix(int[][] A){
        int[][] prefixSumMatrix = new int[A.length][A[0].length];
        // create prefix sum of row and column.
        prefixSumMatrix[0][0] = A[0][0];
        for(int j = 1 ; j <A[0].length;j++) prefixSumMatrix[0][j] = findMod(A[0][j] + prefixSumMatrix[0][j-1]);
        for(int i = 1 ; i <A.length;i++) prefixSumMatrix[i][0] = findMod(A[i][0] + prefixSumMatrix[i-1][0]);

        for(int i = 1; i<A.length;i++){
            for(int j = 1; j<A[0].length;j++){
                prefixSumMatrix[i][j] =
                        findMod(A[i][j] + prefixSumMatrix[i-1][j] + prefixSumMatrix[i][j-1] - prefixSumMatrix[i-1][j-1]);
            }
        }
        return prefixSumMatrix;
    }
    public static int findMod(int number) {
        int res = number % 1000000007;
        if(res < 0)  return (res +  1000000007 )%  1000000007;
        return res;
    }
}
