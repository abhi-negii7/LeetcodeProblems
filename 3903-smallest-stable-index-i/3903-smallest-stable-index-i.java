class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int stableIdx = -1;
        int larg[] = new int[nums.length];
        larg[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            larg[i] = Math.max(larg[i - 1], nums[i]);
        }

        int smallest = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            smallest = Math.min(smallest, nums[i]);
            if (larg[i] - smallest<=k) {
                stableIdx = i;
            }
        }
        return stableIdx;
    }
}