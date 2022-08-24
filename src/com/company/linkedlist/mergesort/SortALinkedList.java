package com.company.linkedlist.mergesort;

import com.company.linkedlist.LLCreation;
import com.company.linkedlist.Node;

import static com.company.linkedlist.LLCreation.createLL;

public class SortALinkedList {
    public static void main(String[] args) {
        LLCreation.traverseLL(sortList(createLL(new int[]{7,12,10,5})));
    }
    public static Node sortList(Node A) {
        Node head = A;
        if(head == null) return head;
        if(head.next == null) return head;

        Node mid = findMid(head);
        Node headR = mid.next;
        mid.next = null;
        Node headL = head;

        Node sortedL = sortList(headL);
        Node sortedR = sortList(headR);
        return merge(sortedL,sortedR);
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node nodeL, Node nodeR){

        if(nodeL==null) return nodeR;
        if(nodeR==null) return nodeL;

        Node ans_head = null;
        Node temp = null;

        if(nodeL.data <= nodeR.data){
            ans_head = nodeL;
            temp = nodeL;
            nodeL = nodeL.next;
        }
        else{
            ans_head = nodeR;
            temp = nodeR;
            nodeR = nodeR.next;
        }
        while(nodeL!=null && nodeR!=null){
            if(nodeL.data <= nodeR.data){
                temp.next = nodeL;
                nodeL = nodeL.next;
            }
            else{
                temp.next = nodeR;
                nodeR = nodeR.next;
            }
            temp = temp.next;
        }
        if(nodeL!=null){
            temp.next = nodeL;
        }
        else{
            temp.next = nodeR;
        }
        return ans_head;
    }
}
