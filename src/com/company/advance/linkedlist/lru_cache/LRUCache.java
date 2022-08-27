package com.company.advance.linkedlist.lru_cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    static class DLLNode{
        int key;
        int value;
        DLLNode next;
        DLLNode prev;
        DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    private DLLNode dummy;
    private DLLNode head;
    private DLLNode tail;
    private int capacity;
    private Map<Integer, DLLNode> hm;
    public LRUCache(int capacity) {
        this.dummy = new DLLNode(-1,-1);
        this.head = dummy;
        this.tail = dummy;
        this.capacity = capacity;
        this.hm = new HashMap<>();
    }
    public int get(int key) {
        if(hm.containsKey(key)) {
            DLLNode dnode = hm.get(key);
            int val = dnode.value;
            if(dnode !=tail) {
                removeNode(dnode);
                insertAtBack(dnode);
            }
            return val;
        }
        return -1;
    }
    public void set(int key, int value) {
        if(hm.containsKey(key)) {
            DLLNode dnode = hm.get(key);
            dnode.value = value;
            if(dnode != tail) {
                removeNode(dnode);
                insertAtBack(dnode);
            }
        }
        else {
            DLLNode dnode = new DLLNode(key,value);
            if(hm.size() == capacity) {
                hm.remove(head.next.key);
                removeNode(head.next);
            }
            hm.put(key,dnode);
            insertAtBack(dnode);
        }
    }
    public void removeNode(DLLNode dnode) {
        dnode.prev.next = dnode.next;
        if(dnode == tail || dnode.next == null) {
            tail = dnode.prev;
        }else {
            dnode.next.prev = dnode.prev;
        }
    }
    public void insertAtBack(DLLNode dnode) {
        tail.next = dnode;
        dnode.prev = tail;
        tail = dnode;
    }
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(1,10);
        lruCache.set(2,20);
        System.out.println(lruCache.get(2));
        lruCache.set(2,20);
        lruCache.set(2,20);
        System.out.println(lruCache.capacity);
        lruCache.set(3,30);
        lruCache.set(4,40);
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.capacity);

    }
}