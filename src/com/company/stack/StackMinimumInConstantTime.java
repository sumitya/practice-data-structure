package com.company.stack;

public class StackMinimumInConstantTime{

    public static void main(String[] args) throws
            Stack.StackUnderFlowExcept,Stack.StackOverFlowExcept{
        MinimumStack minimumStack = new MinimumStack();
        minimumStack.push(2);
        minimumStack.push(4);
        minimumStack.push(8);
        minimumStack.push(1);

        System.out.println(minimumStack.getMinimum());

        minimumStack.pop();

        System.out.println(minimumStack.getMinimum());
    }

    public static class MinimumStack{
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> minStack = new Stack<>();

        public void push(int data)
                throws
                Stack.StackOverFlowExcept,
                Stack.StackUnderFlowExcept{

            int min = data;
            if(!minStack.isEmpty()){
                if(min > minStack.peek()){
                    min = minStack.peek();
                }
            }
            stack.push(data);
            minStack.push(min);
        }

        public int pop() throws Stack.StackUnderFlowExcept{
            minStack.pop();
            return stack.pop();
        }

        public int getMinimum() throws Stack.StackUnderFlowExcept{
            return minStack.peek();
        }
    }
}
