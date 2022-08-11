package com.company.hashing;

import java.util.HashMap;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 100, 105};
        int[] arr1 = {1, 2, 3, 4, 5 };
        int[] arr2 = {42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37};
        int B = 100;
        solve(arr2,B);
    }
    public static int[] solve(int[] A, int B) {
        HashMap<Long,Integer> hm = new HashMap<Long,Integer>();
        long[] PSA = new long[A.length];
        int[] arr = new int[1];
        PSA[0] = A[0];
        hm.put(PSA[0],0);
        long sum = 0;
        //create hm and psa
        for(int i = 1;i <A.length;i++){
            sum += A[i];
            hm.put(sum,i);
            PSA[i] = PSA[i-1] + A[i];
        }
        //base cases
        /*if(A[0]==B) {
            arr[0] = A[0];
            return arr;
        }
        if(A[A.length-1]==B) {
            return A;
        }*/
        //traversal to check indexes
        for(int i = 0;i <A.length;i++){
            if(hm.containsKey(PSA[i] - B)){
                int endIndex = i;
                int startIndex = hm.get(PSA[i] - B) +1;
                int arrLength = (endIndex - startIndex) +1;
                int[] resultArr = new int[arrLength];
                int k = 0;
                for(int j = startIndex;j <=endIndex;j++){
                    resultArr[startIndex - startIndex +k] = A[j];
                    k++;
                }
                return resultArr;
            }
        }
        arr[0] = -1;
        return arr;
    }
}
