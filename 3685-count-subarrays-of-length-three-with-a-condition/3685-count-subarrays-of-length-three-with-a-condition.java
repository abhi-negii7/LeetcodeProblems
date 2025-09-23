class Solution {
    public int countSubarrays(int[] nums) {

        int count = 0;
        for (int third = 2; third < nums.length; third++) {
            int firstEle = nums[third - 2];
            if (nums[third] + firstEle == ((double)nums[third - 1] / 2))
                count++;
        }
        return count;
    }
}