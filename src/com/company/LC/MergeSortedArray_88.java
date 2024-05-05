package com.company.LC;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);
        System.out.println();
        merge(new int[]{1},1, new int[]{},0);
        System.out.println();
        merge(new int[]{0},0, new int[]{1},1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0 && i >= 0 ) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            nums1[0] = nums2[0];
            System.out.print(nums1[0]);
            return;
        }
        int i =0, j =0,k=0;
        int[] sorted = new int[(m-n)+n];

        while(i < (m-n) && j < n) {
            if(nums1[i] < nums2[j]) {
                sorted[k++] = nums1[i++];
            } else {
                sorted[k++] = nums2[j++];
            }
        }
        while(i < (m-n)) sorted[k++] = nums1[i++];
        while(j < n) sorted[k++] = nums2[j++];
        for(int num: sorted) System.out.print(num);
    }
}
