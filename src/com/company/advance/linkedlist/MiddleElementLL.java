package com.company.advance.linkedlist;


public class MiddleElementLL {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        int midEle = middleElement(node1);
        System.out.println(midEle);
    }
    public static int middleElement(Node head) {
        if(head == null) return head.data;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            // Question here, why both conditions required.
            // Ans: in case of even no. of nodes, fast.next.next will point to null,
            // to avoid NPE, fast !=null check is needed.
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
