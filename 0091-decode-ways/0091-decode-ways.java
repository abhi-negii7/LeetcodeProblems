class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(s, 0,dp);
    }

    public int solve(String s, int idx, int dp[]) {

        // BASE CASE if possible solution exist
        if (idx == s.length()) {
            return 1;
        }

        // invalid 
        if (s.charAt(idx) == '0')
            return 0;

        if (dp[idx] != -1)
            return dp[idx];
        // one digit
        int oneDigit = solve(s, idx + 1,dp);

        // two digit
        int twoDigit = 0;
        if (idx + 1 <= s.length() - 1 && (s.charAt(idx) == '1' || s.charAt(idx) == '2' && s.charAt(idx + 1) < '7')) {
            twoDigit = solve(s, idx + 2,dp);
        }

        return dp[idx]=oneDigit + twoDigit;

    }
}