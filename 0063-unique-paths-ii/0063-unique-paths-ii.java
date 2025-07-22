class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // Dp array
        int[][] dp = new int[m][n];

        // fill dp array with -ve number(-1)
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return findUniquePath(0, 0, obstacleGrid, dp);
    }

    public int findUniquePath(int row, int col, int[][] path, int[][] dp) {

        // BASE CASE

        // if we find one way
        if (row == path.length - 1 && col == path[0].length - 1 && path[row][col]!=1)
            return 1;

        // if out of bound or find obstacle
        if (row >= path.length || col >= path[0].length || path[row][col] == 1)
            return 0;

        // if value already present in the dp array
        if (dp[row][col] != -1)
            return dp[row][col];

        // Down
        int downPath = findUniquePath(row + 1, col, path, dp);

        // Right
        int rightPath = findUniquePath(row, col + 1, path, dp);

        return dp[row][col] = downPath + rightPath;

    }
}