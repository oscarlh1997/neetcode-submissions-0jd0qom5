class Solution {
    public int countComponents(int n, int[][] edges) {
        if (n == 0 || n == 1)   {return 0;}

        List<List<Integer>> adjL = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjL.add(new ArrayList<>());
            }
        
        for(int [] edge: edges)  {
            adjL.get(edge[0]).add(edge[1]);
            adjL.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        for (int node = 0; node<n; node++)  {
            if(!visited[node])  {
                dfs(node,adjL,visited);
                components++;
            }
        }

        return components;

    }

    public void dfs (int node, List<List<Integer>> adjL, boolean[] visited) {
        visited[node] = true;

        for(int neigh: adjL.get(node))  {
            if(!visited[neigh]) {
                dfs(neigh,adjL,visited);
            }
        }
    }
}
 