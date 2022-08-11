package com.company.advance.sorting.techniques;

import java.util.Arrays;

public class BubbleSorting {
    static int[] A;
    public static void main(String[] args) {
        A = new int[]{11,2,9,4,9,10,11};
        bubbleSort(A);

    }
    public static void bubbleSort(int[] A) {
        for(int k = 1 ; k < A.length; k++) {
            for(int i = 0 ; i < A.length-k; i++) {
                if(A[i] >A[i+1]) {
                    swap(A,i,i+1);
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
