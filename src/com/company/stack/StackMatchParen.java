package com.company.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StackMatchParen {

    private static Map<Character,Character> matchingParentMap = new HashMap<>();
    private static Set<Character> openingParentSet = new HashSet<>();

    static {
        matchingParentMap.put(')','(');
        matchingParentMap.put('}','{');
        matchingParentMap.put(']','[');
        openingParentSet.addAll(matchingParentMap.values());
    }

    public static void main(String[] args) {
        System.out.println(String.format(
                "Has matching paren %s? : %s","(abcd)",hasMatchingParen("(abcd)")
        ));

        System.out.println(String.format(
                "Has matching paren %s? : %s","{{{}}]()",hasMatchingParen("{}}]()")
        ));
    }

    public static boolean hasMatchingParen(String input){
        try{

            Stack<Character> parenStack = new Stack<>();
            for(int i=0; i < input.length();i++){
                char ch = input.charAt(i);

                //add to stack, if opening paren
                if(openingParentSet.contains(ch)){
                    parenStack.push(ch);
                }
                if(matchingParentMap.containsKey(ch)){
                    Character lastParen = parenStack.pop();
                    if(lastParen != matchingParentMap.get(ch)){
                        return false;
                    }
                }
            }
            return parenStack.isEmpty();

        }catch(Stack.StackOverFlowExcept stoex){
            System.err.println("Stack Full");
        }
         catch(Stack.StackUnderFlowExcept stuex){
            System.err.println("Stack Empty");
        }

        return false;
    }

}
