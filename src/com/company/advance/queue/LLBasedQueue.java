package com.company.advance.queue;

import com.company.advance.linkedlist.LLCreation;
import com.company.advance.linkedlist.Node;

public class LLBasedQueue {
    Node tail;
    public Node enQueue(Node head,int x) {
        Node temp = LLCreation.createNodeLL(3);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = tail.next;
        }
        return head;
    }
    public Node deQueue(Node head) {
        if(head == null) return null;
        if(head == tail) {
            //free(temp); -- in java its done automatically by GC
            head = null;
            tail = null;
        }
        else {
            Node temp = head;
            head = head.next;
            //free(temp); -- in java its done automatically by GC
        }
        return head;
    }
    public int getFront(Node head) {
        if(head == null) return 0; // or better throw exception
        return head.data;
    }
    public int getRear(Node head) {
        if(head == null) return 0; // or better throw exception
        return tail.data;
    }
    public boolean isEmpty(Node head) {
        if(head == null) return true;
        else return false;
    }
}
