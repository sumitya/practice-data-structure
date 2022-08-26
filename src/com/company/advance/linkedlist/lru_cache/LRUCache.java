package com.company.advance.linkedlist.lru_cache;

import com.company.advance.linkedlist.DoubleLLNode;
import com.company.advance.linkedlist.LLCreation;
import java.util.HashMap;

public class LRUCache {
    final static int SIZE = 3;
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2};
        HashMap<Integer, DoubleLLNode> hm = new HashMap<>();
        DoubleLLNode doubleLL = LLCreation.createDoubleLL(new int[]{1,2,3,4,5});
        LLCreation.traverseDoubleLL(doubleLL);

        for(int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                DoubleLLNode dnode = hm.get(arr[i]);
                if(dnode.next != null) {
                    removeNode(doubleLL,dnode);
                    insertAtBack(doubleLL,dnode);
                }
            } else {
                DoubleLLNode dnode = new DoubleLLNode(arr[i]);
                hm.put(arr[i],dnode);
                if(hm.size() == SIZE) {
                    removeNode(doubleLL,dnode);
                    insertAtBack(doubleLL,dnode);
                }
            }
        }
    }
    public static DoubleLLNode removeNode(DoubleLLNode doubleLL,DoubleLLNode dnode) {
        DoubleLLNode temp = doubleLL;
        DoubleLLNode nextNode = dnode.next;
        DoubleLLNode prevNode = dnode.prev;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        return null;
    }
    public static DoubleLLNode insertAtBack(DoubleLLNode doubleLL,DoubleLLNode dnode) {
        DoubleLLNode temp = doubleLL;
        DoubleLLNode nextNode = dnode.next;
        DoubleLLNode prevNode = dnode.prev;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        return temp;
    }

    public int get(int key) {

        return 1;
    }

    public void set(int key, int value) {

    }
}