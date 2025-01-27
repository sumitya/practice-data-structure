package com.practice.sorting;

public class NobelElement {
    public static void main(String[] args) {
        int arr1[] = {-10,1,1,1,4,4,4,7,10};
        int arr2[] = {-10,1,1,2,4,4,4,8,10};
        System.out.println(getNumberOfNobelElements(arr2));
    }
    public static int getNumberOfNobelElements(int arr[]) {
        int ans = 0;
        int less = 0;
        if(arr[0] == 0) return ans++;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) less = i;
            else{}
            if(less == arr[i]) ans++;
        }
        return ans;
    }
}
