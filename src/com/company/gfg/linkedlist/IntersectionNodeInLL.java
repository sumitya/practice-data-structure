package com.company.gfg.linkedlist;

// Java implementation of the approach
class IntersectionNodeInLL {

    static class Node {

        int data;
        Node next;
    }

    // Function to return the intersection point
    // of the two linked lists head1 and head2
    static int getIntesectionNode(Node head1, Node head2) {
        Node current1 = head1;
        Node current2 = head2;

        // If one of the head is null
        if (current1 == null || current2 == null )
            return -1;

        int count=0;
        // Continue until we find intersection node
        while (current1 != null && current2 != null
                ) {
            if(current1 != current2) {
                count++;
                current1 = current1.next;
                current2 = current2.next;

                // If we get intersection node
                if (current1 == current2)
                    return current1.data;

                // If one of them reaches end
                if (current1 == null )
                    current1 = head2;
                if (current2 == null )
                    current2 = head1;
            }
        }
        return current1.data;
    }
    // Driver code
    public static void main(String[] args) {
	/*
		Create two linked lists

		1st 3.6.9.15.30
		2nd 10.15.30

		15 is the intersection point
	*/

        Node newNode;
        // Addition of new nodes
        Node head1 = new Node();
        head1.data = 10;
        Node head2 = new Node();
        head2.data = 3;
        newNode = new Node();
        newNode.data = 6;
        head2.next = newNode;
        newNode = new Node();
        newNode.data = 9;
        head2.next.next = newNode;
        newNode = new Node();
        newNode.data = 15;
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node();
        newNode.data = 30;
        head1.next.next = newNode;
        head1.next.next.next = null;
        System.out.print(getIntesectionNode(head1, head2));
    }
}

