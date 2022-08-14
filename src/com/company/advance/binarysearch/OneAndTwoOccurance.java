package com.company.advance.binarysearch;

public class OneAndTwoOccurance {
    public static void main(String[] args) {
        System.out.println(oneOccurance(new int[]{1,1,2,2,3,3,4,5,5}));
    }
    static int oneOccurance(int[] A) {
        int start = 1;
        int end = A.length-1;
        int first = -1;
        int second = -1;

        while(start <=end) {
            int mid = start + (end - start)/2;
            if(A[mid] !=A[mid-1] && A[mid] !=A[mid+1]) {
                return A[mid];
            }
            if(A[mid] == A[mid-1]) {
                first = mid - 1;
                second = mid;
            }
            else {
                first = mid;
                second = mid + 1;
            }
            if(first % 2 ==0) {
                start = second + 1;
            }
            else{
                end = first - 1;
            }
        }
        return -1;
    }

}
