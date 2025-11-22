class Solution {
    public int minMoves(int[] nums) {

        int minNum = Integer.MAX_VALUE;

        // Find the minimum number in the array
        for (int i = 0; i < nums.length; i++) {
            if (minNum > nums[i]) {
                minNum = nums[i];
            }
        }

        int move = 0;
        for (int i : nums) {
            move = move + (i - minNum);
        }
        return move;
    }
}