package com.company.LC;

import java.util.ArrayList;

public class kthLargestElementArray_215 {
    static ArrayList<Integer> ANew;
    public static void main(String[] args) {
        //System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));

    }

    public static int findKthLargest(int[] nums, int k) {
        ANew=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) ANew.add(nums[i]);
        int start = 0;
        for(int j = 1; j <= k; j++) {
            int mini = ANew.get(start);
            int index = start;
            for(int i = start; i< ANew.size(); i++) {
                if(ANew.get(i) > mini) {
                    mini = ANew.get(i);
                    index = i;
                }
            }
            swap(start,index);
            start++;
        }
        return ANew.get(k-1);
    }

    public static int findKthLargest1(int[] nums, int k) {
        int start = 0;
        for(int j = 1; j <= k; j++) { //kth largest
            System.out.println(start);
            int max = nums[start];
            int index = start;
            for(int i = start; i < nums.length; i++) {
                if(nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            int temp = start;
            start = index;
            index = temp;
            start++;
        }

        return nums[k-1];
    }
    public static void swap(int start,int index) {
        int temp=start;
        start = index;
        index = temp;
    }
}
