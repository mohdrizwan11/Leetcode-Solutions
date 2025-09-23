class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int redundant[] = new int[2];

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            boolean visited[] = new boolean[n + 1];

            if (dfs(u, v, visited, graph)) {
                redundant = edge;
            } else {
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
        }
        return redundant;
    }

    private boolean dfs(int source, int target, boolean visited[], ArrayList<ArrayList<Integer>> graph) {
        if (source == target)
            return true;
        visited[source] = true;

        for (int neighbour : graph.get(source)) {
            if (!visited[neighbour]) {
                if (dfs(neighbour, target, visited, graph)) {
                    return true;
                }
            }

        }
        return false;

    }
}