package com.practice.array2d;

public class AntiDiagonalPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        // loop 1 - left to right
        for (int j = 0; j <arr[0].length;j++) {
            int startI = 0;
            int startJ = j;
            printAntiDiagonalElements(arr,startI,startJ);
            System.out.println();
        }
        // loop 2 - top to bottom
        for (int i = 1; i <arr.length;i++) {
            int startI = i;
            int startJ = arr[0].length-1;
            printAntiDiagonalElements(arr,startI,startJ);
            System.out.println();
        }
    }
    public static void printAntiDiagonalElements(int[][] matrix, int start, int end) {
        int i = start;
        int j = end;
        while (i < matrix.length && j >=0) {
            System.out.print(matrix[i][j]);
            i++;
            j--;
        }
    }
}

