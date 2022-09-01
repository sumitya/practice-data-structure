package com.company.advance.queue;

import com.company.advance.linkedlist.Node;

public class TaskScheduling {
    // @TODO: this needs fixing
    public static void main(String[] args) {
        int[] A = {2,3,1,5,4};
        int[] B = {1,3,5}; // ,4,2
        LLBasedQueue llQueue = new LLBasedQueue();
        Node head = null;
        for(int i = 0; i<A.length; i++) {
            head = llQueue.enQueue(head,A[i]);
        }
        for(int i = 0; i<B.length; i++) {
            if(B[i] != llQueue.getFront(head)) {
                Node temp = llQueue.deQueue(head);
                llQueue.enQueue(temp,A[i]);
            }
            else {
                llQueue.deQueue(head);
            }
        }
        System.out.println(head.data);
    }
}
