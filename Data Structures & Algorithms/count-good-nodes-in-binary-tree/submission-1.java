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
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
        
    }

    public int dfs(TreeNode root, int pathMax)  {
        if(root == null)    {
            return 0;
        }

        int count = root.val >= pathMax ? 1 : 0;
        pathMax = Math.max(root.val,pathMax);

        return count + dfs(root.left,pathMax) + dfs(root.right,pathMax);
    }
}
