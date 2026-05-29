class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int currNum = nums[i];
            // digit sum
            while (currNum != 0) {
                sum += currNum % 10;
                currNum /= 10;
            }
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }
}