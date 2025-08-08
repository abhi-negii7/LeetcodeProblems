class Solution {
    public int longestOnes(int[] nums, int k) {
        // Time Complexity -> O(N)
        // Space Complexity -> O(1)
        // pointer variables
        int start = 0;
        int end = 0;
        // variable to track the number of zeros
        int zeros = 0;
        // variable to track the maximum window size
        int maxLen = 0;

        while (end < nums.length) {
            // if we get the zero increase zeros variable
            if (nums[end] == 0)
                zeros++;

            if (zeros > k) {
                // if start index has the zeros
                if (nums[start] == 0)
                    zeros--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}