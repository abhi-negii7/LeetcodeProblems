class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxAvg = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        double sum = 0;
        while (j < nums.length) {
            sum = sum + nums[j];
            int windowSize = j - i + 1;

            if (windowSize == k) {
                maxAvg = Math.max(maxAvg, sum / k);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return maxAvg;
    }
}