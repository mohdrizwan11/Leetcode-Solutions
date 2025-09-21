class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int m = image.length;
        int n = image[0].length;

        int ogColor = image[sr][sc];

        if(ogColor == color)
        {
            return image;
        }

        dfs(image, sr, sc, ogColor, color, m, n);

        return image;
    }

    private void dfs(int image[][], int sr, int sc, int ogColor, int color, int m, int n)
    {
        //base cases
        if(sr < 0 || sc < 0 || sr >= m || sc >= n) return;
        if(image[sr][sc] != ogColor) return;

        //paint the current pixel
        image[sr][sc] = color;

        dfs(image, sr-1, sc, ogColor, color, m, n); //top
        dfs(image, sr+1, sc, ogColor, color, m, n); //bottom
        dfs(image, sr, sc-1, ogColor, color, m, n); //left
        dfs(image, sr, sc+1, ogColor, color, m, n); //right
        
    }
}