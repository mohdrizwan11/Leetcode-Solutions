class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        Queue<int[]> q = new LinkedList<>();

        //push all the rotten oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j, 0 }); //row, col, time
                }
            }
        }

        //BFS
        while (!q.isEmpty()) {
            int curr[] = q.poll();
            int i = curr[0];
            int j = curr[1];
            int time = curr[2];

            ans = Math.max(ans, time);

            //top
            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                grid[i - 1][j] = 2;
                q.offer(new int[] { i - 1, j, time + 1 });
            }

            //right
            if (j + 1 < n && grid[i][j + 1] == 1) {
                grid[i][j + 1] = 2;
                q.offer(new int[] { i, j + 1, time + 1 });
            }

            //left
            if (i + 1 < m && grid[i + 1][j] == 1) {
                grid[i + 1][j] = 2;
                q.offer(new int[] { i + 1, j, time + 1 });
            }

            //bottom
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                grid[i][j - 1] = 2;
                q.offer(new int[] { i, j - 1, time + 1 });
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }
}