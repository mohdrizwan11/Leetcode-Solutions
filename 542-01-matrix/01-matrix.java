class Solution {
    public int[][] updateMatrix(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;

        int dist[][] = new int[m][n];
        Queue<int[]> q = new ArrayDeque<>();

        // Step 1: initialize dist and queue
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] == 0)
                {
                    dist[i][j] = 0;                // zero cell, distance = 0
                    q.add(new int[]{i, j});        // add to queue
                }
                else
                {
                    dist[i][j] = Integer.MAX_VALUE; // set infinity for ones
                }
            }
        }

        // directions: top, right, bottom, left
        int dir[][] = {{-1,0}, {0,1}, {1,0}, {0,-1}};

        // Step 2: BFS
        while (!q.isEmpty())
        {
            int cell[] = q.poll();
            int i = cell[0];
            int j = cell[1];

            for (int d[] : dir)
            {
                int ni = i + d[0];
                int nj = j + d[1];

                if (ni >= 0 && nj >= 0 && ni < m && nj < n)
                {
                    if (dist[ni][nj] > dist[i][j] + 1)
                    {
                        dist[ni][nj] = dist[i][j] + 1;
                        q.add(new int[]{ni, nj});
                    }
                }
            }
        }

        return dist;
    }
}
