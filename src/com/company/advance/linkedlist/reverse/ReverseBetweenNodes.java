package com.company.advance.linkedlist.reverse;

import com.company.advance.linkedlist.LLCreation;
import com.company.advance.linkedlist.Node;

import static com.company.advance.linkedlist.LLCreation.createLL;

public class ReverseBetweenNodes {
    public static void main(String[] args) {
        Node list1 = createLL(new int[]{1,2,3,4,5});
        LLCreation.traverseLL(reverseBetween(list1,2,4));
    }
    public static Node reverseBetween(Node A, int B, int C) {
        if(A.next == null){
            return A;
        }
        Node head = A; // main linked list pointer
        Node headRev = null; // reverse linked list pointer
        Node h3 = null; // pointing reverse last element ( and also to connect the 2nd half of linklist)
        int count = 1;
        while(head != null && count <= C) {
            if(count > B && count <= C) {
                Node temp = head;
                head = head.next;
                temp.next = headRev;
                headRev = temp;
            }
            else if(count == B) {
                Node temp = head;
                head = head.next;
                temp.next = headRev;
                headRev = temp;
                h3 = temp;
            }
            else{
                head = head.next;
            }
            count++;
        }
        // 1,2,3,4,5  ->  1 4,3,2 5 =>,  headREv - 4, h3 - 2, h4 -1
        if(A.next != null) {
            Node h4 = A; // pointer to connect the reverse and the 1st half linklist
            while(h4 != null && B-1 > 1) {
                h4 = h4.next;
                B--;
            }
            h4.next = headRev; // connecting 1st half
        }
        else {
            A = headRev;
        }
        h3.next = head; // connecting second half
        return A;
    }
    public Node reverseBetweenScaler(Node A, int m, int n) {
        int i;
        Node node = A;
        Node prev = null;
        m--;
        n--;
        for (i = 0; i < m; i++) {
            prev = node;
            node = node.next;
        }
        if (prev != null)
            prev.next = reverseList(node, n - m + 1);
        else
            A = reverseList(node, n - m + 1);
        return A;
    }

    public Node reverseList(Node A, int count) {
        Node node, prev, temp, last;
        node = A;
        last = A;
        if (node == null)
            return null;
        prev = null;
        while (node != null && count > 0) {
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            count--;
        }
        last.next = node;
        return prev;
    }
}