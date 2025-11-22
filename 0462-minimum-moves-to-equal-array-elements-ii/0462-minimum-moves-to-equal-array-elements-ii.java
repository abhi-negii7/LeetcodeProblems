class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);

        int median = nums[nums.length/2];

        int move = 0;
        for(int i=0;i<nums.length;i++){
            move += Math.abs(nums[i] - median);
        }

        return move;
    }
}