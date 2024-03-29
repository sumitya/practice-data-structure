package com.company.advance.linkedlist;

public class LLOperations {
    static Node head;
    static int length;
    public static class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }

    public static void insertNode(int position, int value) {
        if(position>length+1) {
            return;
        }

        Node newNode = new Node(value);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }
        else {
            int counter=1;
            Node curr = head;
            while(counter<position-1){
                curr=curr.next;
                counter++;
            }
            newNode.next=curr.next;
            curr.next=newNode;
        }
        length++;
    }

    public static void deleteNode(int position) {
        if(position>length) {
            return ;
        }
        if(position==1){
            head=head.next;
        }else{
            int counter=1;
            Node curr=head;
            while(counter<position-1){
                counter++;
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        length--;
    }

    public static void printLL() {
        if(length == 0) {
            return;
        }
        Node node=head;
        while (node.next != null) {
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.print(node.val);
    }
}