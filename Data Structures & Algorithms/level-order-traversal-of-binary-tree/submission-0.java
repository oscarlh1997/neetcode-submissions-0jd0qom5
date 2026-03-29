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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> response = new ArrayList();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();

        if (root != null)   {
            queue.add(root);
        }

        List<Integer> currentL =  new ArrayList();

        while (!queue.isEmpty())    {
            int size = queue.size();
            for (int i = 0; i<size; i++)    {
                TreeNode currentNode = queue.removeFirst();
                currentL.add(currentNode.val) ;
                
                if (currentNode.left != null)   {
                    queue.add(currentNode.left);
                }

                if(currentNode.right!= null)    {
                    queue.add(currentNode.right);
                }

                
                

            }
            response.add(currentL);
            currentL = new ArrayList();
        }

        return response;


        
        
    }
}
