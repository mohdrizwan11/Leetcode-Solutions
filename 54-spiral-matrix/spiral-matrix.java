class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> mat = new ArrayList<>();
        int startRow = 0, startCol = 0;
        int endRow = matrix.length - 1, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top row
            for (int i = startCol; i <= endCol; i++) {
                mat.add(matrix[startRow][i]);
            }
            //Right column
            for (int j = startRow + 1; j <= endRow; j++) {
                mat.add(matrix[j][endCol]);
            }

            //When the matrix becomes 1 row or 1 column
            if (startRow == endRow || startCol == endCol) {
                break;
            }
            //Bottom row
            for (int i = endCol - 1; i >= startCol; i--) {
                mat.add(matrix[endRow][i]);
            }
            //left column
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                mat.add(matrix[j][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return mat;
    }
}