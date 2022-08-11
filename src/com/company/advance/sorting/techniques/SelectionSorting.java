package com.company.advance.sorting.techniques;

public class SelectionSorting {
    static int[] A;
    public static void main(String[] args) {
        A = new int[]{1,5,4,10,7,20};
        selectSort(A,4);
    }
    public static void selectSort(int[] A,int k) {
        int start = 0;
        for(int i = 1; i <=k; i++) {
            int min = A[start];
            int index = start;
            for(int j = start; j < A.length-1; j++) {
                if(A[i] < min) {
                    min = A[i];
                    index = i;
                }
            }
            swap(start,index);
            start++;
        }
        System.out.println(A[k-1]);
    }
    public static void swap(int start, int index) {
        int temp = A[start];
        A[start] = A[index];
        A[index] = temp;
    }
}
