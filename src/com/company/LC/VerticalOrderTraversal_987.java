package com.company.LC;

import java.util.*;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Pair {
    TreeNode node;
    int level;

    public Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}
    public class VerticalOrderTraversal_987 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        Queue<Pair> q=new LinkedList<Pair>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair tempPair=q.peek();
            q.remove();
            TreeNode temp = tempPair.node;
            int level=tempPair.level;

            max=Math.max(max,level);
            min=Math.min(min,level);

            if(hm.containsKey(level)){
                List<Integer> lt2=hm.get(level);
                lt2.add(temp.val);
                hm.put(level,lt2);
            }
            else{
                List<Integer> lt1=new ArrayList<Integer>();
                lt1.add(temp.val);
                hm.put(level, lt1);
            }
            if(temp.left!=null){
                Pair pair=new Pair(temp.left,level-1);
                q.add(pair);
            }
            if(temp.right!=null){
                Pair pair=new Pair(temp.right,level+1);
                q.add(pair);
            }
        }


        for(int i=min;i<=max;i++){
            List<Integer> listTemp = hm.get(i);
            Collections.sort(listTemp);
            res.add(listTemp);
        }
        return res;
    }
}
