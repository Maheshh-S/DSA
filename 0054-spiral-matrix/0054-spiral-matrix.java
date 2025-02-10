import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); // To store the output
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse top row
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // Traverse right column
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // Traverse bottom row (only if there are multiple rows left)
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
            }

            // Traverse left column (only if there are multiple columns left)
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
            }

            // Move to the inner spiral
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }
}
