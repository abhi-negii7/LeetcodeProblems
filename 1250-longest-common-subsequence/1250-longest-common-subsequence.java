class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // create a dp array to store
        int dp[][] = new int[text1.length()][text2.length()];

        // fill it with negative numbers
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, 0, text1, text2, dp);
    }

    public static int solve(int i, int j, String text1, String text2, int dp[][]) {
        // invalid index
        if (i >= text1.length() || j >= text2.length())
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];
        // if both have common character
        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + solve(i + 1, j + 1, text1, text2, dp);
        }
        // if character is not common
        // first skip text1 character and secondly skip text2 character 
        // check both possible cases
        else {
            return dp[i][j] = Math.max(solve(i + 1, j, text1, text2, dp), solve(i, j + 1, text1, text2, dp));
        }
    }
}