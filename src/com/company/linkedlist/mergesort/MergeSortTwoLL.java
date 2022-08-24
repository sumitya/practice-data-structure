package com.company.linkedlist.mergesort;

import com.company.linkedlist.LLCreation;
import com.company.linkedlist.Node;

import static com.company.linkedlist.LLCreation.createLL;

public class MergeSortTwoLL {
    public static void main(String[] args) {
        Node list1 = createLL(new int[]{7,10,12,20,35});
        Node list2 = createLL(new int[]{8,9,12,14,16});
        LLCreation.traverseLL(list1);
        LLCreation.traverseLL(list2);
        Node headOfMergedList = merge(list1,list2);

        LLCreation.traverseLL(headOfMergedList);
    }
    public static Node mergeSort(Node head) {
        if(head == null) return null;
        if(head.next == null) return head;
        if(head.next == null) return head;
        if(head.next == null) return head;
        return head;
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
                //temp = temp.next;
            }
            else{
                temp.next = nodeR;
                nodeR = nodeR.next;
                //temp = temp.next;
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
