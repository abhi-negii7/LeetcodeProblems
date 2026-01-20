class Solution {
    public long countSubarrays(int[] nums, int k) {

        int maxNum = 0;
        for (int i : nums) {
            maxNum = Math.max(maxNum, i);
        }

        int maxFreq = 0;
        long subArrCount = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == maxNum)
                maxFreq++;

            while (maxFreq == k) {
                subArrCount = subArrCount + (nums.length - j);
                if (nums[i] == maxNum) {
                    maxFreq--;
                }
                i++;
            }

        }
        return subArrCount;
    }
}