/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> copies = new HashMap<>();

        Node current = head;
        while (current != null) {
            copies.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node copy = copies.get(current);
            copy.next = copies.get(current.next);
            copy.random = copies.get(current.random);
            current = current.next;
        }

        return copies.get(head);
    }
}