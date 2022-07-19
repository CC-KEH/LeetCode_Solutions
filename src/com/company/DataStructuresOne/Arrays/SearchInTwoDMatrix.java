package com.company.DataStructuresOne.Arrays;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 10;
        System.out.println(searchMatrix(mat, target));
    }

    private static boolean searchMatrix(int[][] mat, int target) {
        int endCol = mat[0].length - 1;
        int endRow = mat.length - 1;
        if (target == mat[0][0] || target == mat[0][endCol] || target == mat[endRow][0] || target == mat[endRow][endCol]) {
            return true;
        } else {
            for (int i = 0; i < mat.length; i++) {
                if(mat[i][endCol] == target){
                    return true;
                }
                else if (mat[i][endCol] > target) {
                    if (binarySearch(0, endCol, mat[i], target)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static boolean binarySearch(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
