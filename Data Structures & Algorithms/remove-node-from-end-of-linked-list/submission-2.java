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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int linkedListSize = 0;

        // 1. Calcular la longitud
        while (temp != null) {
            temp = temp.next;
            linkedListSize++;
        }

        // 2. Calcular el índice que queremos eliminar
        int target = linkedListSize - n;

        // 3. Si eliminamos el primer nodo
        if (target == 0) {
            return head.next;
        }

        // 4. Llegar al nodo anterior al objetivo
        temp = head;

        for (int i = 0; i < target - 1; i++) {
            temp = temp.next;
        }

        // 5. Eliminar el nodo objetivo
        temp.next = temp.next.next;

        return head;
    }
}
