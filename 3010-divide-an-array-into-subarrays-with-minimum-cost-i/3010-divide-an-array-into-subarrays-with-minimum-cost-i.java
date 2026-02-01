class Solution {
    public int minimumCost(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (smallest > nums[i]) {
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (secondSmallest > nums[i])
                secondSmallest = nums[i];
        }

        return nums[0] + smallest + secondSmallest;
    }
}