class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++)
        {
            //Primary Sum
            sum += mat[i][i];
            //Secondary Sum
            if(i != n-1-i)
                sum += mat[i][n-1-i];
        }
        return sum;
    }
}