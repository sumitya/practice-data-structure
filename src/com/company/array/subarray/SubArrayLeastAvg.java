package com.company.array.subarray;

public class SubArrayLeastAvg {
    public static void main(String[] args) {

        int[] A = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
        int B = 1;

        int[] A1 = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int B1 = 9;
        System.out.println(solve(A1,B1));
    }

    public static int solve(int[] A, int B) {

        int min_avg = Integer.MAX_VALUE;
        int min_index = 0;
        for(int i = 0; i< A.length - B + 1; i++){
            int count = 0;
            int avg = 0;
            for(int j = i; j < i+B; j++){
                count = count + A[j];

            }


            avg = count/B;
            System.out.println("avg=> "+avg + "min_avg=> "+min_avg);
            if(avg < min_avg){

                min_avg = avg;
                min_index = i;
            }
        }
        return min_index;
    }
}
