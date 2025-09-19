class Solution {
    public int numIslands(char[][] grid) 
    {
        int islands = 0;
        int m = grid.length;
        int n = grid[0].length;

        boolean vis[][] = new boolean[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == '1' && !vis[i][j])
                {
                    dfs(i, j, m, n, vis, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    void dfs(int i, int j, int m, int n, boolean vis[][], char grid[][])
    {
        if(i < 0 || j < 0 || i >= m || j >= n || vis[i][j] || grid[i][j] != '1')
        {
            return;
        }

        vis[i][j] = true;

        //Visit all the neighbours
        dfs(i-1, j, m, n, vis, grid); //top
        dfs(i, j+1, m, n, vis, grid); //right
        dfs(i+1, j, m, n, vis, grid); //bottom
        dfs(i, j-1, m, n, vis, grid); //left

    }
}