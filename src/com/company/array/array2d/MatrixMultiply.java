package com.company.array.array2d;

import java.util.Arrays;

public class MatrixMultiply {

    public static void main(String[] args) {
        int[][] A = {{1, 2},{3, 4}};
        int[][] B = {{5, 6},{7, 8}};

        int[][] A1 = {{94, 91}};
        int[][] B1 = {{35, -52, -12, 26, -93, -61},{29, -20, -36, -9, 66, 15}};

        for(int[] arr:solve(A1,B1)){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] solve(int[][] A, int[][] B) {

        int[][] C = new int[A.length][B[0].length];
        for(int i = 0;i<A.length;i++){
            for(int j = 0; j< A[0].length;j++){
                for(int k = 0; k < B[0].length-1;k++){
                    System.out.print("A[i][k] "+A[i][k] +" B[k][j] => "+B[k][j]);
                    C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                }
                System.out.println();
            }
            System.out.println();
        }

        return C;
    }
}
