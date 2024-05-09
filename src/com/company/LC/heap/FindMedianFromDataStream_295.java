package com.company.LC.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream_295 {
    PriorityQueue<Integer> maxHeapLeft;
    PriorityQueue<Integer> minHeapRight;
    boolean even;
    public static void main(String[] args) {
        FindMedianFromDataStream_295 obj = new FindMedianFromDataStream_295();
        obj.addNum(4);
        System.out.println(obj.findMedian());
        obj.addNum(6);
        System.out.println(obj.findMedian());
        obj.addNum(10);
        System.out.println(obj.findMedian());
        obj.addNum(1);
        System.out.println(obj.findMedian());
        obj.addNum(70);
        System.out.println(obj.findMedian());

    }
    public FindMedianFromDataStream_295() {
        maxHeapLeft = new PriorityQueue<>(Collections.reverseOrder());
        minHeapRight = new PriorityQueue<>();
        // tracking the index of the elements., odd index element goes to left heap
        // even goes to right
        even = false;
    }

    // Invariant: changing landscape with constant needs:
    // |maxHeapLeft| = |minHeapRight|
    // or
    // |maxHeapLeft| = |minHeapRight| +1
    public void addNum(int num) {
        if (!even) {
            //add to the left heap first,
            maxHeapLeft.offer(num);
            //remove from left and add to right heap to maintain Invariant.
            minHeapRight.offer(maxHeapLeft.poll());
        } else {
            //add to the right heap,
            minHeapRight.offer(num);
            //remove from right and add to left heap to maintain Invariant.
            maxHeapLeft.offer(minHeapRight.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (!even)
            return (minHeapRight.peek() + maxHeapLeft.peek()) / 2.0;
        else
            return minHeapRight.peek();
    }
}





