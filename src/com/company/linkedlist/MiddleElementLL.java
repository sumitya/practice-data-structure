package com.company.linkedlist;


public class MiddleElementLL {
    public static void main(String[] args) {
        
    }
    public int middleElement(Node head) {
        if(head == null) return head.data;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {  // Question here, why both conditions required.
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
