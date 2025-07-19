class Solution {
    public int minPathSum(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m][n];

        // fill the dp array with -1
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(grid,0,0,dp);
    }

    public static int solve(int[][] grid, int row, int col,int[][] dp) {

        // BASE CASE
        if (row == grid.length-1 && col == grid[0].length-1)
            return grid[row][col];

        // In case of Invalid Index
        if (row >= grid.length || col >= grid[0].length)
            return Integer.MAX_VALUE;

        // if value already stored in dp matrix
        if(dp[row][col]!=-1)
        return dp[row][col];

        return dp[row][col]=grid[row][col]+Math.min(solve(grid,row+1,col,dp),solve(grid,row,col+1,dp));

    }
}