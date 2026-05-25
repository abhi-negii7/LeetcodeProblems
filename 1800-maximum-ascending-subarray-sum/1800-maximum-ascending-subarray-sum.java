class Solution {
    public int maxAscendingSum(int[] nums) {

        int n = nums.length;
        int maxSum = nums[n - 1];
        int currSum = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}