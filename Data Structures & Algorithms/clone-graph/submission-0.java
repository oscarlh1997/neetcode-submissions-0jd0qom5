/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> cloned = new HashMap<>();
        return dfs(node, cloned);
    }

    private Node dfs(Node node, Map<Node, Node> cloned) {
        // Caso base: grafo vacío
        if (node == null) {
            return null;
        }

        // Si ya existe el clon, lo reutilizamos
        if (cloned.containsKey(node)) {
            return cloned.get(node);
        }

        // Creamos el clon del nodo actual
        Node copy = new Node(node.val);

        // Lo guardamos ANTES de explorar sus vecinos
        cloned.put(node, copy);

        // Clonamos y conectamos todos sus vecinos
        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(dfs(neighbor, cloned));
        }

        return copy;
    }
}