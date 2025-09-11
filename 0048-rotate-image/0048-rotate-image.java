class Solution {
    public void rotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Transpose of matrix -> O(N/2 * N/2)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    break;
                else {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // Reverse the matrix -> O(N*N/2)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}