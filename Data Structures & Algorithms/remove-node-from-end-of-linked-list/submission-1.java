/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listSize = 0;
        ListNode curr = head;
        if (head == null) {
            return head;
        }

        while (curr != null) {
            curr = curr.next;
            listSize++;
        }

        int targetIndex = listSize - n;
        if (targetIndex == 0) {
            return head.next;
        }

        curr = head;
        for (int i = 0; i < targetIndex - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}