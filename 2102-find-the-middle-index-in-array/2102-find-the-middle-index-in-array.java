class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];

        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            suffix[i] = nums[i]+suffix[i+1];

        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == suffix[i])
                return i;
        }
        return -1;

    }
}