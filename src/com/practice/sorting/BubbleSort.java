package com.practice.sorting;

public class BubbleSort {
    static int []arr = {1,4,5,10,7,20};
    public static void main(String[] args) {
        System.out.println(findKthLargestElement(arr,2));
    }
    public static int findKthLargestElement(int arr[], int k) {
        for(int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j+1]) swap(j, j+1);
            }
        }

        return arr[arr.length-k];
    }
    public static void swap(int start,int index) {
        int temp=arr[start];
        arr[start] = arr[index];
        arr[index] = temp;
    }
}
