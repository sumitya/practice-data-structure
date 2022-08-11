package com.company.array;

public class ArrayTwoSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,6,6,6,6,6,6,7,8,9,12};
        System.out.println(solve(arr,121));
    }

    public static int solve(int[] A, int B) {
        for(int i = 0; i < A.length; i++){
            int first = i;

            for(int j = i+1; j < A.length; j++){
                int second = j;
                if(first != second){
                    if(A[i] + A[j] == B) return 1;
                }
            }

        }

        return 0;
    }
}
