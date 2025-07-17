class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0, 0, m, n,dp);
    }

    public int solve(int row, int col, int m, int n,int dp[][]) {

        if (row == m-1 && col == n-1) {
            return 1;
        }
        if (row > m || col > n)
            return 0;

        if(dp[row][col]!=-1)
        return dp[row][col];

        // right
        int opt1 = solve(row, col + 1, m, n,dp);

        // down
        int opt2 = solve(row + 1, col, m, n,dp);

        return dp[row][col]=opt1 + opt2;

    }
}