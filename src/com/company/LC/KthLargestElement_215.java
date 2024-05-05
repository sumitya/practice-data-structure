package com.company.LC;

import java.util.PriorityQueue;

public class KthLargestElement_215 {
    public static void main(String[] args) {
    int[] heapArr = new int[]{3,2,1,5,6,4};
    System.out.println(findKthLargest(heapArr,3));

    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int element: nums) {
            queue.offer(element);
            //once the size of heap becomes greater than K, remove the root element,
            // this way at the end of heapcreation, we have kth element as root of heap
            if(queue.size() > k) queue.poll();
        }
        return queue.peek();
    }
}