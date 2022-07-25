package com.company.DataStructuresOne.BinaryTree;

import java.util.Queue;
import java.util.Stack;

public class LevelorderTraversal {
    public static void main(String[] args) {
        System.out.println("refer to function below");
    }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<TreeNode>();
//        List<List<Integer>> list = new ArrayList<>();
//        if(root == null) return list;
//        q.add(root);
//        while(!q.isEmpty()){
//            List<Integer> sublist =  new ArrayList<>();
//            int size = q.size();
//            for(int i=0;i<size;i++){
//                if(q.peek().left!=null){
//                    q.add(q.peek().left);
//                }
//                if(q.peek().right!=null){
//                    q.add(q.peek().right);
//                }
//                TreeNode temp = q.poll();
//                sublist.add(temp.val);
//            }
//            list.add(sublist);
//        }
//        return list;
//    }

}
