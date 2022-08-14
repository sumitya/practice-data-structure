package com.company.advance.binarysearch;

public class FindFreqOfNumber {
    public static void main(String[] args) {
        int result = findFreq(new int[]{1,1,2,2,4,4,4,4,5,6},6);
        System.out.println(result);
    }

    static int findFreq(int[] A,int value) {
        int firstIndex = -1;
        int start = 0;
        int end = A.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(value > A[mid]) {
                start = mid + 1;
            }
            if(value < A[mid]) {
                end = mid - 1;
            }
            if(A[mid] == value) {
                firstIndex = mid;
                end = mid - 1;
            }
        }
        if(firstIndex == -1) {
            return 0;
        }
        int secondIndex = -1;
        start = 0;
        end = A.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(value > A[mid]) {
                start = mid + 1;
            }
            if(value < A[mid]) {
                end = mid - 1;
            }
            if(A[mid] == value) {
                secondIndex = mid;
                start = mid + 1;
            }
        }
        int res = secondIndex - firstIndex +1;
        return res;
    }
}
