package com.company.array;

import java.util.Arrays;

public class RangeSum {
    public static void main(String[] args) {
        int[] A = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5 };
        int[][] B = {{7,10},{3,10},{3,5},{1,10}};
        System.out.println(Arrays.toString(rangeSum(A,B)));
    }

    public static long[] rangeSum(int[] A, int[][] B) {

        long[] ACumulative = new long[A.length];

        ACumulative[0] = A[0];
        for(int i = 1; i< A.length; i++){
            ACumulative[i] = ACumulative[i-1] + A[i];
        }

        //System.out.println(Arrays.toString(ACumulative));
        //System.out.println("B.length => "+B.length);
        long[] res = new long[B.length];
        for(int i = 0; i< B.length ; i++){
            //System.out.println("B[i][0] => "+B[i][0] + "\t"+ "B[i][1] => "+ B[i][1]);
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            //(0,0) (0,1)
            //(1,0) (1,1)
            //answerQuery(start,end);

            if(start==0){ res[i] = ACumulative[end];}
            else {res[i] = ACumulative[end] - ACumulative[start -1];}


        }
        return res;

    }
}
