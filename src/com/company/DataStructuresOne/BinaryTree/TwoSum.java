package com.company.DataStructuresOne.BinaryTree;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("refer to function below");
    }

    public static boolean twoSum(TreeNode root, int sum, HashSet<Integer> set) {
        if (root == null) return false;
        if(twoSum(root.left,sum,set)){
            return true;
        }
        if(set.contains(sum-root.val)){
            return true;
        }
        set.add(root.val);

        return twoSum(root.right,sum,set);
    }
}
