package com.company.stack;

public class Stack<T> {

    private static int MAX_SIZE = 5;
    private Element<T> top;
    private int size = 0;

    public static void main(String[] args) throws StackOverFlowExcept,StackUnderFlowExcept{

        Stack<Character> stack1 = new Stack<Character>();

        stack1.push('d');
        stack1.push('a');
        stack1.push('t');
        stack1.push('a');
        stack1.push('s');
        System.out.println(stack1.getSize());

        try{
            stack1.push('t');
        }catch(StackOverFlowExcept stoe){
            System.out.println("Stack is full!!");
        }

        stack1.pop();
        System.out.println(stack1.getSize());

        System.out.println(stack1.top.getData());
    }

    public void push(T data) throws StackOverFlowExcept{
        if(size==MAX_SIZE){ throw new StackOverFlowExcept();}

        Element element = new Element(data,top);
        top = element;
        size+=1;
    }

    public T pop() throws StackUnderFlowExcept{

        if(size==0){throw new StackUnderFlowExcept();}

        T data = top.getData();
        top = top.getNextElement();
        size-=1;
        return data;
    }

    public T peek() throws StackUnderFlowExcept{
        if(size==0){throw new StackUnderFlowExcept();}

        return top.getData();
    }

    public boolean isEmpty(){ return size == 0; }

    public boolean isFull(){ return size == MAX_SIZE; }

    public int getSize(){ return size; }

    public static class Element<T>{
        private T data;
        private Element next;

        public Element(T data, Element next){
            this.data = data;
            this.next = next;
        }

        public void setData(T data){this.data = data;}
        public T getData(){return data;}
        public void setNextElement(Element next ){ this.next = next;}
        public Element<T> getNextElement(){ return next;}

        @Override
        public String toString() {
            return "Element{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static class StackOverFlowExcept extends Exception{ }

    public static class StackUnderFlowExcept extends Exception{ }
}
