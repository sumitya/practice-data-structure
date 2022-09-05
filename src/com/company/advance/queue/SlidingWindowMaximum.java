package com.company.advance.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class Pair {
    int value;
    int index;
    Pair(int value,int index) {
        this.value = value;
        this.index = index;
    }
}
public class SlidingWindowMaximum {
    static ArrayList<Integer> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSlidingWindow(nums,k);
        System.out.println();
        }
    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Pair> dq = new LinkedList<>();
        dq.addLast(new Pair(nums[0],0)); // insert to the right
        //first window
        for(int i = 1; i < k; i++) {
            while(!dq.isEmpty() && dq.peekLast().value <=nums[i]) {
                dq.removeLast(); // keep on deleting till values are smaller than current value
            }
            dq.addLast(new Pair(nums[i],i));
        }
        res.add(dq.peekFirst().value);  // get the ans. for 1st window

        //2nd window onwards
        for(int i = k ; i<nums.length; i++) {
            int index = dq.peekFirst().index;    // | This help to purge elements
            if(index <(i-k+1)) dq.removeFirst();  // | which are beyond current window.

            while(!dq.isEmpty() && dq.peekLast().value <=nums[i]) dq.removeLast();
            dq.addLast(new Pair(nums[i],i));
            res.add(dq.peekFirst().value); // get the ans. for all windows after 1st
        }
        return res.stream().mapToInt( v -> v).toArray();
    }
}


