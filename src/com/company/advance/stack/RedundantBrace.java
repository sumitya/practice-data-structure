package com.company.advance.stack;

import java.util.Stack;

public class RedundantBrace {
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(braces(str));
    }
    public static int braces(String A) {
        if(A.length()==1){
            return 0;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<A.length();i++){
            char a=A.charAt(i);
            if(a=='('||a=='/'||a=='*'||a=='-'|| a=='+'){
                stack.push(a);
            }
            if(a==')'){
                int count=0;
                while(stack.peek()!='('){
                    count++;
//pop other operators
                    stack.pop();
                }
//popping the '('
                stack.pop();
                //means no operators between the braces
                if(count==0){
                    return 1;
                }
            }
        }
        return 0;
    }
}

