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
    private int preIdx = 0;                              // siguiente raíz en preorder
    private Map<Integer, Integer> inIdx = new HashMap<>(); // valor -> posición en inorder
    private int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            inIdx.put(inorder[i], i);
        }
        return build(0, inorder.length - 1);
    }

    // Construye el subárbol cuyos nodos están en inorder[left..right]
    private TreeNode build(int left, int right) {
        if (left > right) return null;               // rango vacío: no hay nodos

        int val = preorder[preIdx++];                // 1. la raíz es el siguiente del preorden
        TreeNode root = new TreeNode(val);

        int mid = inIdx.get(val);                    // 2. su posición en el inorden

        root.left = build(left, mid - 1);            // 3. lo que queda a su izquierda
        root.right = build(mid + 1, right);          // 4. lo que queda a su derecha
        return root;
    }
}