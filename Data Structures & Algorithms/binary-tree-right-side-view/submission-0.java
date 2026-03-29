class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();

        if (root != null)   {
            queue.add(root);
        }

        List<Integer> response = new ArrayList();
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++)   {
                TreeNode currNode = queue.poll();
                
                if (i == size - 1)  {
                    response.add(currNode.val);
                }

                if(currNode.left != null)   {
                    queue.add(currNode.left);
                }
                if(currNode.right != null)  {
                    queue.add(currNode.right);
                }
            }

        }
        return response;
        
    }
}