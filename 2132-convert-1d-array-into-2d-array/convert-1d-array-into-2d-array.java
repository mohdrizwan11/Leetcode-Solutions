class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k = original.length;
        int twoDArray[][] = new int[m][n];

        if(n * m < k) return new int[][]{};
        if(k < n * m) return new int[][]{};

        int z = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                twoDArray[i][j] = original[z++];
            }
        }

        return twoDArray;
    }
}