package com.company.advance.binarysearch;

public class FindFloorOfNumber {
    public static void main(String[] args) {
        System.out.println(floor(new int[]{100,90,80,50,40,30,10},39));
    }
    static int floor(int[] A,int value) {
        int bestAnsTillNow = Integer.MIN_VALUE;
        int start = 0;
        int end = A.length;

        while(start <=end) {
            int mid = start + (end - start)/2;
            if(A[mid] == value) return A[mid];
            if(A[mid] > value) {
                start = mid + 1;
            }
            if(A[mid] < value) {
                bestAnsTillNow = A[mid];
                end = mid - 1;
            }
        }
        return bestAnsTillNow;
    }
}
