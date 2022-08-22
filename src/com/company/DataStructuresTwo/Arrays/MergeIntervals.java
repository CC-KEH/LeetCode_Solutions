package com.company.DataStructuresTwo.Arrays;

import com.company.DataStructuresOne.BinaryTree.PreorderTraversal;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    public static int[][] merge(int[][] A) {
        if (A == null || A.length == 0)
            return new int[][]{};

        ArrayList<int[]> res = new ArrayList<>();

        int i = 0, j = i + 1;
        int startMin, endMax;
        while (i < A.length - 1 && j < A.length) {
            if (A[i][1] < A[j][0]) {
                res.add(new int[]{A[i][0], A[i][1]});
                i++;
                j++;
            }else{
                startMin = Math.min(A[i][0], A[j][0]);
                endMax = Math.max(A[i][1], A[j][1]);
                res.add(new int[]{startMin, endMax});
                i+=2;
                j+=2;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
