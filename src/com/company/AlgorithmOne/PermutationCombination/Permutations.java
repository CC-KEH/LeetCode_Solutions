package com.company.AlgorithmOne.PermutationCombination;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Refer to function below");
    }

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> arr = new ArrayList<>();
//        boolean[] check = new boolean[nums.length];
//        findPermutations(ans,arr,check,nums);
//        return ans;
//    }
//    public void findPermutations(List<List<Integer>> ans,List<Integer> ds,boolean[] check,int[] nums){
//        if(ds.size()==nums.length){
//            ans.add(new ArrayList<>(ds));
//            return;
//        }
//
//        for(int i=0;i<nums.length;i++){
//            if(!check[i]){
//                check[i] = true;
//                ds.add(nums[i]);
//                findPermutations(ans,ds,check,nums);
//                ds.remove(ds.size()-1);
//                check[i] = false;
//            }
//        }
//
//    }
}
