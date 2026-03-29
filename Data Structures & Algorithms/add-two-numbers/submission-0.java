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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        double num1 = 0, num2 = 0, sum = 0;
        int count = 0;
        ListNode h1 = l1,
        h2 = l2,
        dummy = new ListNode(),
        h3 = dummy;

        while (h1 != null) {
            num1 = num1 + h1.val * Math.pow(10, count);
            h1 = h1.next;
            count++;
        }

        count = 0;

        while (h2 != null) {
            num2 = num2 + h2.val * Math.pow(10, count);
            h2 = h2.next;
            count++;
        }

        sum = num1 + num2;
        if (sum == 0) return new ListNode(0);

        while (sum >= 0.9) {
            h3.next = new ListNode((int)(Math.round(sum) % 10));
            sum = Math.floor(sum / 10);
            h3 = h3.next;
        }

        return dummy.next;
    }
}