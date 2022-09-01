package com.company.advance.queue;

import com.company.advance.linkedlist.LLCreation;
import com.company.advance.linkedlist.Node;

public class LLBasedQueue {
    static Node tail;
    static Node head = null;
    public static void main(String[] args) {
        /*Node eRes = enQueue(head,1);
        Node eRes1 = enQueue(eRes,2);
        Node eRes2 = enQueue(eRes1,3);

        Node dRes = deQueue(eRes2);
        Node dRes1 = deQueue(dRes);*/

    }
    public Node enQueue(Node head,int x) {
        Node temp = LLCreation.createNodeLL(x);
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
    public  Node deQueue(Node head) {
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
