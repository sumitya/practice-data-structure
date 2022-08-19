package com.company.linkedlist;

public class RemoveNthNodeFromEnd {
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
        
        Node head = removeNthFromEnd(node1,1);
        printListNode(head);
    }
    public static Node removeNthFromEnd(Node A, int B) {
        if(A == null) return null;
        Node temp = A;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        if(B > count){
            A = A.next;
            return A;
        }
        //----------
        Node p1 = A;
        Node p2 = A;
        Node prev = A;
        //Keep moving B times the P1
        while(B>0 && p1.next!=null){
            p1 = p1.next;
            B--;
        }
        if(B>0){
            return A.next;
        }
        //Need to keep P2 at 2nd node and previous behind it.
        p2 = p2.next;
        while(p1.next!=null){
            p1 = p1.next;
            prev = p2;
            p2 = p2.next;
        }
        //The P2 will be at Bth location from end now skip it
        prev.next = p2.next;
        //----------
        return A;
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

