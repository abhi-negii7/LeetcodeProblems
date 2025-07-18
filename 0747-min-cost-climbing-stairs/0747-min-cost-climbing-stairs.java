class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int prev1 = 0;
        int prev2 = cost[n - 1];

        for (int ind = n - 2; ind >= 0; ind--) {

            // One Step
            int opt1 = cost[ind] + prev2;

            //Two Step
            int opt2 = cost[ind] + prev1;

            prev1 = prev2;
            prev2 = Math.min(opt1, opt2);
        }
        return Math.min(prev1, prev2);
    }
}