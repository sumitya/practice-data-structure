package com.company.advance.queue;


import java.sql.Struct;
import java.util.Stack;

public class StackBasedQueue {
    Stack<Integer>  stackForEnqueue = new Stack<>();
    Stack<Integer>  stackForDequeue = new Stack<>();

    //enqueue
    public void enQueue(int val) {
        stackForEnqueue.push(val);
    }
    //dequeue
    public int deQueue() {
        if(stackForDequeue.isEmpty()) {
            while(!stackForEnqueue.isEmpty())
            stackForDequeue.push(stackForEnqueue.pop());
        }
        return stackForDequeue.pop();
    }
    //isEmpty
    public boolean isEmpty() {
        if(stackForEnqueue.isEmpty() && stackForDequeue.isEmpty()) return true;
        else return false;
    }
    //size
    public int size() {
        return stackForEnqueue.size() + stackForDequeue.size();
    }
    //front
    public int getFront() {
        if(!stackForDequeue.isEmpty()) return stackForDequeue.peek();
        if(stackForDequeue.isEmpty()) {
            while(!stackForEnqueue.isEmpty())  stackForDequeue.push(stackForEnqueue.pop());
        }
        return stackForDequeue.peek();
    }
    //rear
    public int getRear() {
        if(!stackForEnqueue.isEmpty()) return stackForEnqueue.peek();
        if(stackForEnqueue.isEmpty() && stackForDequeue.isEmpty()) return 0;//throw exception here
        if(stackForEnqueue.isEmpty() && !stackForDequeue.isEmpty()) {
            while(!stackForDequeue.isEmpty())  stackForEnqueue.push(stackForDequeue.pop());
        }
        return stackForEnqueue.peek();
    }
}
