package com.company.advance.linkedlist;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        //                  _________     _________     _________    _________    __________
        //     head   -->   |_1_|_*_| ->  |_2_|_*_|  -> |_3_|_*_| -> |_4_|_*_| ->  |_4_|_*_| -> null
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node resultNode = deleteListNode(node1);
        printListNode(resultNode);

    }
    public static Node deleteListNode(Node head) {
        if(head == null && head.next == null) return null;
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        // or prev.next = slow.next;
        // After the loop, PREV points to previous node of SLOW , make PREV points to next.next
        //                  _________     _________     _________    _________
        //     head   -->   |_1_|_*_| ->  |_2_|_*_|  -> |_4_|_*_| ->  |_4_|_*_| -> null
        //                                                  ^
        //                                               ___|______
        //                                               |_3_|_*_|
        return head;
    }
    public static void printListNode(Node head) {
        if(head == null) System.out.println("Empty List");
        Node temp = head;
        while(temp !=null) {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }

}
