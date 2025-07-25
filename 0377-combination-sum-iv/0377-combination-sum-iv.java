class Solution {
    public int combinationSum4(int[] nums, int target) {

        int dp[] = new int[target + 1];
        // fill the dp with negative value i.e by -1
        Arrays.fill(dp, -1);

        return createCombi(nums, target, dp);
    }

    public int createCombi(int[] nums, int target, int[] dp) {

        //BASE CASE
        if (target == 0) {
            return 1;
        }

        // Invalid index or case
        if (target < 0)
            return 0;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            // if value already stored in the dp array
            if (dp[target] != -1)
                return dp[target];
    
            if (target >= nums[i]) {
                count += createCombi(nums, target - nums[i], dp);
            }
        }
        
        return dp[target] = count;

    }
}