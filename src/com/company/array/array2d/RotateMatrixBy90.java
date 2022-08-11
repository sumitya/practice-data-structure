package com.company.array.array2d;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        solve(matrix1);
    }
    public static void solve(int[][] A) {
        for(int i = 0; i<A.length;i++){
            for(int j = i; j<A[0].length;j++){
                int temp = A[j][i];
                A[j][i] = A[i][j];
                A[i][j] = temp;
            }
        }
        for(int[] aMatrix:A){
            //System.out.println(Arrays.toString(aMatrix));
        }
        //System.out.println(Math.ceil((float)A[0].length/2));
        for(int i = 0;i<A.length;i++){
            int k = A[0].length - 1;
            for(int j = 0;j<k;j++){
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
                k--;
            }
        }
        System.out.println();
        for(int[] aMatrix:A){
            System.out.println(Arrays.toString(aMatrix));
        }
    }
}
