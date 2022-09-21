package com.company.advance.trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode{
    char ch;
    Map<Character,TrieNode> child = new HashMap<Character,TrieNode>();
    boolean isEndOfWord= false;
    TrieNode(char x){
        ch = x;
    }
}
public class SpellingChecker {
    public static void main(String[] args) {
        String[] A = { "hat", "cat", "rat" };
        String[] B = { "cat", "ball" };
    }

    public int[] solve(String[] A, String[] B) {
        int ans[] = new int[B.length];
        TrieNode root = new TrieNode(' ');
        for(int i=0;i<A.length;i++){
            insert(root,A[i]);
        }
        for(int i=0;i<B.length;i++){
            ans[i] = search(root,B[i]);
        }
        return ans;
    }
    public void insert(TrieNode root,String word){
        TrieNode temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.child.containsKey(ch)){
                temp.child.put(ch,new TrieNode(ch));
            }
            temp = temp.child.get(ch);
        }
        temp.isEndOfWord = true;
        return;
    }
    public int search(TrieNode root,String word){
        TrieNode temp = root;
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.child.containsKey(ch)){
                return 0;
            }
            temp = temp.child.get(ch);
        }
        if(temp.isEndOfWord){
            return 1;
        }
        return 0;
    }
}
