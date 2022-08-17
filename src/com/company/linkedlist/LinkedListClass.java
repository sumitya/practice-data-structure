package com.company.linkedlist;

class Node{
    int data;
    Node next;
}
public class LinkedListClass {
    public static void main(String[] args) {
        Node addressExistingLL = createLL();
        traverseLL(addressExistingLL);
        countNodesLL(addressExistingLL);

        System.out.println("=========================");

        Node aNewnode1 = createNodeLL(100);
        Node newLLaddress = addNewNodeLL(addressExistingLL,aNewnode1);
        traverseLL(newLLaddress);

        System.out.println("=========================");

        Node aNewnode2 = createNodeLL(200);
        addNewNodeToEndLL(addressExistingLL,aNewnode2);
        traverseLL(newLLaddress);

    }
    public static void traverseLL(Node node) {
        Node address = node;
        while(address != null) {
            System.out.println(address.data);
            address = address.next;
        }
    }
    public static void countNodesLL(Node node) {
        int count = 0;
        Node temp = node;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
    public static Node createNodeLL(int val) {
        Node node = new Node();
        node.data = val;
        node.next = null;
        return node;
    }
    public static Node createLL() {
        //                                     temp20        temp
        //                  __________      __________      __________
        //     temp10-->   |_10_|_*_| -->  |_20_|_*_|  ---> |_30_|_*_| --> null

        Node temp = createNodeLL(30);
        Node temp20 = createNodeLL(20);
        temp20.next = temp;
        Node temp10 = createNodeLL(10);
        temp10.next = temp20;

        return temp10;
    }
    public static Node addNewNodeLL(Node headExistingLL, Node toBeAdded) {
        toBeAdded.next = headExistingLL;
        return toBeAdded;
    }
    public static Node addNewNodeToEndLL(Node headExistingLL, Node toBeAdded) {
        Node temp = headExistingLL;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = toBeAdded;
        return headExistingLL;
    }
}
