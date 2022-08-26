package com.company.advance.linkedlist;


public class LLCreation {
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
        System.out.print("head ->");
        while(address != null) {
            System.out.print(" [ "+address.data+" ]->");
            address = address.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void traverseDoubleLL(DoubleLLNode node) {
        DoubleLLNode address = node;
        System.out.print("head ->");
        while(address != null) {
            System.out.print(" <-[ "+address.data+" ]->");
            address = address.next;
        }
        System.out.print("NULL");
        System.out.println();
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
        Node node = new Node(val);
        return node;
    }
    public static DoubleLLNode createNodeDoubleLL(int val) {
        DoubleLLNode node = new DoubleLLNode(val);
        return node;
    }

    public static Node createLL(int[] numbers) {
        Node head = createNodeLL(numbers[0]);
        Node temp = head;
        for(int i = 1 ; i < numbers.length; i++) {
            Node currNode = createNodeLL(numbers[i]);
            temp.next = currNode;
            temp = temp.next;
        }
        return head;
    }
    public static DoubleLLNode createDoubleLL(int[] numbers) {
        DoubleLLNode head = new DoubleLLNode(numbers[0]);
        DoubleLLNode temp = head;
        for(int i = 1 ; i < numbers.length; i++) {
            DoubleLLNode currNode = createNodeDoubleLL(numbers[i]);
            temp.next = currNode;
            temp = temp.next;
        }
        return head;
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
