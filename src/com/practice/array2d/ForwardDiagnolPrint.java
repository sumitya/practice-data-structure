package com.practice.array2d;

public class ForwardDiagnolPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        // col 0, from bottom to top
        for(int i = arr.length - 1; i >=0;i--) {
            int startI = i;
            int startJ = 0;
            printDiagonalElements(arr,startI,startJ);
            System.out.println();
        }
        // row 0, from left to right
        for(int j = 1; j <arr[0].length;j++) {
            int startI = 0;
            int startJ = j;
            printDiagonalElements(arr,startI,startJ);
            System.out.println();
        }
    }

    public static void printDiagonalElements(int[][] matrix,int start, int end) {
        int i = start;
        int j = end;
        while(i < matrix.length && j <matrix[0].length) {
            System.out.print(matrix[i][j]+" ");
            i++;
            j++;
        }
    }

}
