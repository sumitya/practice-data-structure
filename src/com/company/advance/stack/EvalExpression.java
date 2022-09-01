package com.company.advance.stack;

import java.util.Stack;

public class EvalExpression {
    public int evalRPN(String[] A) {
        int length = A.length;
        if(length==1) return Integer.parseInt(A[0]);  //Edge case if only one number is present
        Stack<Integer> stk = new Stack<>();
        int result=0;
        for (int i = 0; i < length; i++) {
            if (A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/")) {
                String operator = A[i];
                int b = stk.pop();
                int a = stk.pop();
                if(operator.equals("+")) result = a+b;
                else if(operator.equals("-")) result = a-b;
                else if(operator.equals("*")) result = a*b;
                else if(operator.equals("/")) result = a/b;
                stk.push(result);
            } else {
                int currElement = Integer.parseInt(A[i]);
                stk.push(currElement);
            }
        }
        return result;
    }
}
