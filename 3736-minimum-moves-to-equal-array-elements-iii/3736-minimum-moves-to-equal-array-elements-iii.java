class Solution {
    public int minMoves(int[] nums) {

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums){
            if(maxNum<num) maxNum = num;
            sum+=num;
        }

        return maxNum*nums.length-sum;
    }
}