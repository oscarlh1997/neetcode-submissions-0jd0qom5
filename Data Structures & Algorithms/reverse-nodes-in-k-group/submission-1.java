/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (head != null) {
            ListNode greenFlag = head;
            int counter = 0;

            while (counter < k && greenFlag != null) {
                greenFlag = greenFlag.next;
                counter++;
            }

            if (counter < k) {
                break;
            }

            ListNode groupTail = head;
            ListNode prev = greenFlag;

            while (counter > 0) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
                counter--;
            }

            groupPrev.next = prev;
            groupPrev = groupTail;
        }

        return dummy.next;
    }
}
