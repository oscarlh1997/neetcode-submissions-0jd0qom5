/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;

        while (cur != null) {
            if (p.val < cur.val && q.val < cur.val) {
                cur = cur.left;           // los dos están a la izquierda
            } else if (p.val > cur.val && q.val > cur.val) {
                cur = cur.right;          // los dos están a la derecha
            } else {
                return cur;               // se separan aquí (o uno es cur)
            }
        }
        return null;
    }
}