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

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Created the list head for returning purpose
        ListNode dummyNode = new ListNode(0);
        // A tail to navigate in the new LinkedList
        ListNode tail = dummyNode;
        // Comparison Logic
        while (true) {
            if (l1 == null){
                tail.next = l2;
                break;
            }
            if (l2 == null){
                tail.next = l1;
                break;
            }

            if (l1.val > l2.val){
                tail.next = l2;
                l2 = l2.next;
            }else {
                tail.next = l1;
                l1 = l1.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }
}