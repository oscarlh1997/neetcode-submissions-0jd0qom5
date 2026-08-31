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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> response = new ArrayList();
        inorder(response, root);
        return response;
        
    }

    public void inorder (List<Integer> response, TreeNode root) {

        if (root == null)   {
            return;
          }
        
        inorder(response,root.left);
        response.add(root.val);
        inorder(response,root.right);
        
    }
}