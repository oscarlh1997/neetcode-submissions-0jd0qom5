class Solution {
    public boolean validTree(int n, int[][] edges) {
    if (n <= 0 || edges.length != n - 1) {
        return false;
    }

    List<List<Integer>> adjacency = new ArrayList<>();
    for (int node = 0; node < n; node++) {
        adjacency.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
        adjacency.get(edge[0]).add(edge[1]);
        adjacency.get(edge[1]).add(edge[0]);
    }

    boolean[] visited = new boolean[n];
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(0);
    visited[0] = true;

    int visitedCount = 0;

    while (!stack.isEmpty()) {
        int node = stack.pop();
        visitedCount++;

        for (int neighbor : adjacency.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                stack.push(neighbor);
            }
        }
    }

    return visitedCount == n;
}
}
