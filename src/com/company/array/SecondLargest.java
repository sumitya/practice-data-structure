package com.company.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = {10};
        int[] arr2 = {10,10};
        System.out.println(solve(arr2));
    }

    public static int solve(int[] A) {

        int max = A[0];
        int secondMax = A[0];

        if(A.length==1){
            return -1;
        }

        for(int j = 1; j< A.length; j++){
            if(max < A[j]){
                max = A[j];
            }
        }

        int countHighest = 0;
        for(int j = 0; j< A.length; j++){
            if(A[j]==max){
                countHighest +=1;
            }
        }

        if(countHighest ==2){
            return max;
        }

        for(int j = 1; j< A.length; j++){
            // 1 2 3 4 5 6 7 8 9 10
            if(A[j] > secondMax && A[j] != max){
                secondMax = A[j];
            }
        }
        return secondMax;
    }
}
