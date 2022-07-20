//package com.company.AlgorithmOne.TwoPointers;
//
//import java.util.LinkedList;
//
//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
//
//public class MiddleOfLinkedList {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        middleNode(list);
//    }
//
//    private static void middleNode(ListNode head) {
//                ListNode slow = head;
//                ListNode fast = head;
//
//                while (fast != null && fast.next != null) {
//                    slow = slow.next;
//                    fast = fast.next.next;
//                }
//
//                return slow;
//            }
//        }
//    }
//}
