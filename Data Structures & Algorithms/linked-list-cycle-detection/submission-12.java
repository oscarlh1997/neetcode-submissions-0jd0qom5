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
    public boolean hasCycle(ListNode head) {
        ListNode slw = head;
        ListNode fst = head;

        while (fst != null) {
            if (fst.next == null || fst.next.next == null){
                return false;
            }
            else{
            fst = fst.next.next;
            slw = slw.next;}
            if (fst == slw)    {
                return true;
            }
            
        }
        return false;
    }
}
