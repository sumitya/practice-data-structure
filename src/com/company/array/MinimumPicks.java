package com.company.array;

public class MinimumPicks {

    public static void main(String[] args) {
        int[] A = {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
        int[] A1 = {5, 37, 4, 11, 81, 90, 37, -52, -30, 56};
        System.out.println(solve(A1));
    }

    public static int solve(int[] A) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(A.length==1){
            return -1;
        }

        for(int j = 0; j< A.length; j++){
            if(Math.abs(A[j])%2==0){
                if(max < A[j]){
                    max = A[j];
                }
            }
            else{
                if(min > A[j]){
                    min = A[j];
                }
            }

        }
        System.out.println(max + "\t"+min);
        return max - min;
    }
}
