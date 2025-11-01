class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row = matrix.length-1, col = 0;

        //Staircase Search Top & Right
        while(row >= 0 && col <= matrix[0].length-1){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}