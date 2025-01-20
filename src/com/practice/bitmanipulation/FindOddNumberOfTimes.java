package com.practice.bitmanipulation;

public class FindOddNumberOfTimes {
    public static void main(String[] args) {
        int[] arr = {10,2,3,6,10,2,7,8,8,2,3,2,6,7,7};
        findOddOccurance(arr);
    }
    public static void findOddOccurance(int arr[]){
        int ans = arr[0];
        for (int i = 1; i< arr.length;i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
        System.out.println(1 * Math.pow(10,9));
        System.out.println(1 << 10);
    }
}
