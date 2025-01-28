package com.practice.sorting;

import static com.company.LC.kthLargestElementArray_215.swap;

public class SelectionSort {
    static int []arr = {1,4,5,10,7,20};
    public static void main(String[] args) {
        System.out.println(findKthSmallestElement(arr,4));
    }
    public static int findKthSmallestElement(int []arr, int k) {
        int start = 0;
        for(int j = 1; j <=k ; j++) {
            int index = start;
            int min = arr[start];
            for(int i = start; i < arr.length;i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            swap(start,index);
            start++;
        }
        return arr[k-1];
    }
    public static void swap(int start,int index) {
        int temp=arr[start];
        arr[start] = arr[index];
        arr[index] = temp;
    }
}
