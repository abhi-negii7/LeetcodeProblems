class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx - 1] < 1) {
                ans[0] = idx;
            } else {
                nums[idx - 1] = -nums[idx - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                ans[1] = i + 1;
        }
        return ans;
    }
}