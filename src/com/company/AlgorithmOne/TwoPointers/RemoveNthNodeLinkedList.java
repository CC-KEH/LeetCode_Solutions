//package com.company.AlgorithmOne.TwoPointers;
//
//import java.util.LinkedList;
//
//public class RemoveNthNodeLinkedList {
//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            if(head==null){
//                return head;
//            }
//            if(head.next==null && n>0){
//                head=null;
//                return head;
//            }
//            int size=1;
//            ListNode t = head;
//            while(t.next!=null){
//                t=t.next;
//                size++;
//            }
//            int count = size-n;
//            if(count==0){
//                head=head.next;
//                return head;
//            }
//
//            ListNode temp = head;
//            while(count>1){
//                temp=temp.next;
//                count--;
//            }
//            temp.next=temp.next.next;
//            return head;
//        }
//    }
