class Solution {
    public int longestSubarray(int[] nums) {

        int countZero = 0;
        int maxSub = 0;
        int currSub = 0;

        // Two pointers
        int i = 0;
        int j = 0;

        while (j < nums.length) {

            if (nums[j] == 0)
                countZero++;
                
            while (i < j && countZero >= 2) {
                if (nums[i] == 0)
                    countZero--;
                i++;
            }
            maxSub = Math.max(maxSub, j - i);
            j++;
        }
        return maxSub;
    }
}