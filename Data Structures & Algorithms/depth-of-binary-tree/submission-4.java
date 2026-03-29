class Solution {
    public int maxDepth(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
         if (root!=null)    {
            q.add(root);
         }

         int level = 0;
         while (!q.isEmpty())   {
            level++;
            int size = q.size();
            for (int i = 0; i < size; i++)  {
                TreeNode curr = q.poll();;
                if (curr.left != null)  {
                    q.add(curr.left);
                }
                if (curr.right != null)  {
                    q.add(curr.right);
                }
            }
         }
         return level;
    }
}