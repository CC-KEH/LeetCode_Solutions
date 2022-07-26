package com.company.DataStructuresOne.LinkedList;

public class MergeSortedLists {
    public static void main(String[] args) {
        System.out.println("Refer function below");
    }
//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            if(list1==null){
//                return list2;
//            }
//            else if(list2==null){
//                return list1;
//            }
//            else if(list1==null && list2==null){
//                return null;
//            }
//            ListNode merged = new ListNode(0);
//            ListNode travelInMerge = merged;
//            ListNode ptr1 = list1;
//            ListNode ptr2 = list2;
//            while(ptr1!=null && ptr2!=null){
//                if(ptr1.val>ptr2.val){
//                    travelInMerge.next = ptr2;
//                    ptr2 = ptr2.next;
//                }else{
//                    travelInMerge.next = ptr1;
//                    ptr1 = ptr1.next;
//                }
//                travelInMerge = travelInMerge.next;
//            }
//            if(ptr1!=null){
//                travelInMerge.next = ptr1;
//            }
//            else if(ptr2!=null){
//                travelInMerge.next = ptr2;
//            }
//            return merged.next;
//        }
//    }
}
