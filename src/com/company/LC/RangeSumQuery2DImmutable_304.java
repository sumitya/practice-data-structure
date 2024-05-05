package com.company.LC;

public class RangeSumQuery2DImmutable_304 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};
    NumMatrix obj = new NumMatrix(matrix);
        //{2, 1, 4, 3},{1, 1, 2, 2},{1, 2, 2, 4}
    System.out.println(obj.sumRegion(0,0,1,2));
        System.out.println(obj.sumRegion(2,1,4,3));
        System.out.println(obj.sumRegion(1,1,2,2));
        System.out.println(obj.sumRegion(1,2,2,4));
    }

}
class NumMatrix {
    int[][] prefixSumMatrix = null;
    public NumMatrix(int[][] matrix) {
        prefixSumMatrix = new int[matrix.length][matrix[0].length];
        // create prefix sum of row and column.
        prefixSumMatrix[0][0] = matrix[0][0];
        // for 1st row
        for(int i = 1 ; i <matrix.length;i++) {
            prefixSumMatrix[i][0] = findMod(matrix[i][0] + prefixSumMatrix[i - 1][0]);
        }
        // for 1st col
        for(int j = 1 ; j <matrix[0].length;j++) {
            prefixSumMatrix[0][j] = findMod(matrix[0][j] + prefixSumMatrix[0][j-1]);
        }
        // for remaining row & col
        for(int i = 1; i<matrix.length;i++){
            for(int j = 1; j<matrix[0].length;j++){
                prefixSumMatrix[i][j] =
                        findMod(matrix[i][j] + prefixSumMatrix[i-1][j] + prefixSumMatrix[i][j-1] - prefixSumMatrix[i-1][j-1]);
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = prefixSumMatrix[row2][col2];

        if (row1 > 0) sum = sum - prefixSumMatrix[row1-1][col2];
        if (col1 > 0) sum = sum - prefixSumMatrix[row2][col1-1];
        if (row1 > 0 && col1 > 0) sum = sum + prefixSumMatrix[row1-1][col1-1];

        return sum;
    }
    public int findMod(int number) {
        int res = number % 1000000007;
        if(res < 0)  return (res +  1000000007 )%  1000000007;
        return res;
    }
}
