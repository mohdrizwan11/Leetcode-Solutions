class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row = 0, col = matrix[0].length-1;

        //Staircase Search
        while(row <= matrix.length-1 && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}