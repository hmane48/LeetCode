package _21_MergeTwoSortedLists;

/*  Merge two sorted linked lists and return it as a new list.
    The new list should be made by splicing
    together the nodes of the first two lists.
*/

//Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// Brute force approach
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Created the list head for returning purpose
        ListNode dummyNode = new ListNode(0);
        // A tail to navigate in the new LinkedList
        ListNode tail = dummyNode;
        // Comparison Logic
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }

            if (l1.val > l2.val) {
                tail.next = l2;
                l2 = l2.next;
            } else {
                tail.next = l1;
                l1 = l1.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }

    // Recursive approach
    public ListNode mergeTwoListsR(ListNode a, ListNode b) {

        // If one of the list is null return the other
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val > b.val) {
            b.next = mergeTwoListsR(a, b.next);
            return b;
        } else {
            a.next = mergeTwoListsR(a.next, b);
            return a;
        }
    }
}