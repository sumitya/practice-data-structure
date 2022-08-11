package com.company.array.subarray;

public class SubarrayLeastAvgIndex {
    public static void main(String[] args) {
    int[] A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
    int B = 9;
    System.out.println(solve(A,B));
    }

    public static int solve(int[] A, int B) {

        int min_avg = Integer.MAX_VALUE;
        int min_index = 0;
        for(int i = 0; i< A.length - B + 1; i++){
            int sum = 0;
            int avg = 0;
            for(int j = i; j < i+B; j++){
                sum = sum + A[j];
                //System.out.print("A[j] => "+A[j]+" ");

            }
            System.out.println();

            avg = sum/B;
            System.out.print("AVG => "+avg+" ");
            if(avg<min_avg){

                min_avg = Math.min(avg,min_avg);
                min_index = i;
            }

            System.out.println();
        }
        return min_index;
    }
}
