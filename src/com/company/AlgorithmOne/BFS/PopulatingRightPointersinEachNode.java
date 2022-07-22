package com.company.AlgorithmOne.BFS;

public class PopulatingRightPointersinEachNode {
    public static void main(String[] args) {
        System.out.println("Refer to the function below");
    }
//    public Node point(Node root){
//        if(root==null){
//            return null;
//        }
//
//        Queue<Node> queue = new LinkedList<>();
//
//        queue.add(root);
//        queue.add(null);
//        while(!queue.isEmpty()){
//            Node temp = queue.poll();
//            if(temp==null && queue.isEmpty()){
//                return root;
//            }
//            else if(temp==null){
//                queue.add(null);
//                continue;
//            }
//            else{
//                temp.next = queue.peek();
//                if(temp.left!=null){
//                    queue.add(temp.left);
//                }
//                if(temp.right!=null){
//                    queue.add(temp.right);
//                }
//            }
//        }
//        return root;
//    }
}
