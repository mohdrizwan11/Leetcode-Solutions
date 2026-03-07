class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row[] = new int[m];
        int col[] = new int[n];

        for(int i = 0; i < m; i++){
            int mini = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                mini = Math.min(mini, matrix[i][j]);
            }
            row[i] = mini;
        }

        for(int i = 0; i < n; i++){
            int maxi = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                maxi = Math.max(maxi, matrix[j][i]);
            }
            col[i] = maxi;
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(row[i] == col[j]){
                    result.add(col[j]);
                }
            }
        }

        return result;
    }
}