package com.company.array.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArrayLessThanB {
    public static void main(String[] args) {

        int A = 5;int B = 12;int[] C = {2, 1, 3, 4, 5};
        int A1 = 1;int B1 = 7;int[] C1 = {4};
        int A2 = 5;int B2 = 7;int[] C2 = {3, 8, 8, 9, 7 };
        int A3 = 61;int B3 = 8;int[] C3 = {34, 75, 69, 43, 8, 34, 54, 79, 7, 39, 64, 85, 37, 14, 50, 40, 78, 5, 98, 13, 89, 45, 30, 66, 50, 90, 28, 13, 64, 44, 78, 58, 94, 100, 65, 88, 69, 48, 41, 64, 56, 60, 100, 95, 96, 66, 11, 92, 32, 17, 65, 39, 42, 90, 37, 20, 21, 24, 93, 47, 26 };


        System.out.println(maxSubarray(A3,B3,C3));
    }

    public static int maxSubarray(int A, int B, int[] C) {

        //base case
        boolean greater = false;
        for(int i = 0; i< A; i++){
            if(B >= C[i]) {greater = true;break;}
            else greater = false;
        }
        System.out.println(greater);
        if(!greater) return 0;

        List<Integer> sumList = new ArrayList<>();

        for(int i = 0;i<A;i++){
            int sum = 0;
            for(int j = i; j< A; j++){
                sum = sum + C[j];
                sumList.add(sum);
            }
        }

        int[] arr = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); i++){ arr[i] = sumList.get(i);}

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if((arr[i] > max || arr[i] ==B ) && arr[i] <= B ){
                max = arr[i];
                //System.out.println("max => "+max);
            }
            else{
                //System.out.println("continue for => "+arr[i]+ "max => "+ max);
                continue;
            }
        }
        return max;
    }
}
