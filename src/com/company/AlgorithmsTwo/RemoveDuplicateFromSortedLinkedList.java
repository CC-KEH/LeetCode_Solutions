package com.company.AlgorithmsTwo;

public class RemoveDuplicateFromSortedLinkedList {
    public static void main(String[] args) {
        //Solution Below
    }
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public ListNode deleteDuplicates(ListNode head) {
//            Set<Integer> set = new HashSet<>();
//            if(head==null){
//                return null;
//            }
//            ListNode temp = head;
//
//            while(temp!=null){
//                if(temp.next==null){
//                    break;
//                }
//                if(temp.val==temp.next.val){
//                    set.add(temp.val);
//                    temp.next = temp.next.next;
//                }
//                else{
//                    temp = temp.next;
//                }
//            }
//            ListNode temp2 = head;
//            while(temp2!=null){
//                if(temp2.next==null && set.contains(temp2.val)) return null;
//                if(temp2.next==null) break;
//                if(set.contains(temp2.val)){
//                    head = temp2.next;
//                }
//                if(temp2.next!=null && set.contains(temp2.next.val)){
//                    temp2.next = temp2.next.next;
//                }
//                else{
//                    temp2 = temp2.next;
//                }
//            }
//            return head;
//        }
//    }
}