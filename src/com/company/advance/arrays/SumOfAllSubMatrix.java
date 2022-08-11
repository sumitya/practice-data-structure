package com.company.advance.arrays;

public class SumOfAllSubMatrix {
    public static void main(String[] args) {
        int[][] arr2D = {{1,1},{1,1}};
        System.out.println(solve(arr2D));
    }
    public static int solve(int[][] A) {
        int sum = 0;
        for(int row = 0;row<A.length;row++){
            for(int col = 0;col<A[0].length;col++){
                int contribution = (row+1)*(col+1)*(A.length - row) * (A[0].length - col);
                sum += A[row][col]  * contribution;
            }
        }

        return sum;
    }
}
